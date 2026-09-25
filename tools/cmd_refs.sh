#!/bin/bash
# For each *Command class, list referencing files (excl own) and instantiation sites.
set -u
SRC=/Users/swanky/powerwatch/jadx-output/sources/powerwatch/matrix/com/pwgen2android
CMDSDIR=$SRC/sdk/protocol/commands
OUT=/tmp/cmd_refs.tsv

# Build class list (all *Command.java incl watchsettings)
echo -e "CLASS\tNEW_FILES\tREF_FILES\tNEW_LOCATIONS\tREF_CATEGORIES" > "$OUT"

find "$CMDSDIR" -name "*Command.java" | xargs -n1 basename | sed 's/\.java$//' | sort | while IFS= read -r c; do
  # word-boundary ERE: ClassName not adjacent to identifier chars
  pat="(^|[^A-Za-z0-9_])${c}([^A-Za-z0-9_]|$)"
  # files that reference (exclude own file)
  ref_files=$(grep -rIlE "$pat" "$SRC" 2>/dev/null | grep -v "/${c}\.java$" | sort)
  nref=$(printf '%s' "$ref_files" | grep -c . )
  # files that instantiate new ClassName(
  new_files=$(grep -rIlE "new ${c}[ \t]*\(" "$SRC" 2>/dev/null | sort)
  nnew=$(printf '%s' "$new_files" | grep -c . )
  # locations (file:line) of 'new ClassName('
  new_loc=$(grep -rInE "new ${c}[ \t]*\(" "$SRC" 2>/dev/null | sed "s#$SRC/##" | tr '\n' ';')
  # categories of referencing files (top-level app dirs), dedup
  cats=$(printf '%s\n' "$ref_files" | sed "s#$SRC/##" | awk -F/ '{print $1"/"$2}' | sort -u | tr '\n' ',' | sed 's/,$//')
  printf "%s\t%d\t%d\t%s\t%s\n" "$c" "$nnew" "$nref" "$new_loc" "$cats"
done

echo "Wrote $OUT"
