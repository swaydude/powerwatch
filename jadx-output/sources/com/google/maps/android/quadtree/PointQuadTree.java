package com.google.maps.android.quadtree;

/* JADX INFO: loaded from: classes2.dex */
public class PointQuadTree<T extends com.google.maps.android.quadtree.PointQuadTree.Item> {
    private static final int MAX_DEPTH = 40;
    private static final int MAX_ELEMENTS = 50;
    private final com.google.maps.android.geometry.Bounds mBounds;
    private java.util.List<com.google.maps.android.quadtree.PointQuadTree<T>> mChildren;
    private final int mDepth;
    private java.util.List<T> mItems;

    public interface Item {
        com.google.maps.android.geometry.Point getPoint();
    }

    public PointQuadTree(double d, double d2, double d3, double d4) {
        this(new com.google.maps.android.geometry.Bounds(d, d2, d3, d4));
    }

    public PointQuadTree(com.google.maps.android.geometry.Bounds bounds) {
        this(bounds, 0);
    }

    private PointQuadTree(double d, double d2, double d3, double d4, int i) {
        this(new com.google.maps.android.geometry.Bounds(d, d2, d3, d4), i);
    }

    private PointQuadTree(com.google.maps.android.geometry.Bounds bounds, int i) {
        this.mChildren = null;
        this.mBounds = bounds;
        this.mDepth = i;
    }

    public void add(T t) {
        com.google.maps.android.geometry.Point point = t.getPoint();
        if (this.mBounds.contains(point.x, point.y)) {
            insert(point.x, point.y, t);
        }
    }

    private void insert(double d, double d2, T t) {
        if (this.mChildren == null) {
            if (this.mItems == null) {
                this.mItems = new java.util.ArrayList();
            }
            this.mItems.add(t);
            if (this.mItems.size() <= 50 || this.mDepth >= 40) {
                return;
            }
            split();
            return;
        }
        if (d2 < this.mBounds.midY) {
            if (d < this.mBounds.midX) {
                this.mChildren.get(0).insert(d, d2, t);
                return;
            } else {
                this.mChildren.get(1).insert(d, d2, t);
                return;
            }
        }
        if (d < this.mBounds.midX) {
            this.mChildren.get(2).insert(d, d2, t);
        } else {
            this.mChildren.get(3).insert(d, d2, t);
        }
    }

    private void split() {
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        this.mChildren = arrayList;
        arrayList.add(new com.google.maps.android.quadtree.PointQuadTree(this.mBounds.minX, this.mBounds.midX, this.mBounds.minY, this.mBounds.midY, this.mDepth + 1));
        this.mChildren.add(new com.google.maps.android.quadtree.PointQuadTree<>(this.mBounds.midX, this.mBounds.maxX, this.mBounds.minY, this.mBounds.midY, this.mDepth + 1));
        this.mChildren.add(new com.google.maps.android.quadtree.PointQuadTree<>(this.mBounds.minX, this.mBounds.midX, this.mBounds.midY, this.mBounds.maxY, this.mDepth + 1));
        this.mChildren.add(new com.google.maps.android.quadtree.PointQuadTree<>(this.mBounds.midX, this.mBounds.maxX, this.mBounds.midY, this.mBounds.maxY, this.mDepth + 1));
        java.util.List<T> list = this.mItems;
        this.mItems = null;
        for (T t : list) {
            insert(t.getPoint().x, t.getPoint().y, t);
        }
    }

    public boolean remove(T t) {
        com.google.maps.android.geometry.Point point = t.getPoint();
        if (this.mBounds.contains(point.x, point.y)) {
            return remove(point.x, point.y, t);
        }
        return false;
    }

    private boolean remove(double d, double d2, T t) {
        if (this.mChildren == null) {
            java.util.List<T> list = this.mItems;
            if (list == null) {
                return false;
            }
            return list.remove(t);
        }
        if (d2 < this.mBounds.midY) {
            if (d < this.mBounds.midX) {
                return this.mChildren.get(0).remove(d, d2, t);
            }
            return this.mChildren.get(1).remove(d, d2, t);
        }
        if (d < this.mBounds.midX) {
            return this.mChildren.get(2).remove(d, d2, t);
        }
        return this.mChildren.get(3).remove(d, d2, t);
    }

    public void clear() {
        this.mChildren = null;
        java.util.List<T> list = this.mItems;
        if (list != null) {
            list.clear();
        }
    }

    public java.util.Collection<T> search(com.google.maps.android.geometry.Bounds bounds) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        search(bounds, arrayList);
        return arrayList;
    }

    private void search(com.google.maps.android.geometry.Bounds bounds, java.util.Collection<T> collection) {
        if (this.mBounds.intersects(bounds)) {
            java.util.List<com.google.maps.android.quadtree.PointQuadTree<T>> list = this.mChildren;
            if (list != null) {
                java.util.Iterator<com.google.maps.android.quadtree.PointQuadTree<T>> it = list.iterator();
                while (it.hasNext()) {
                    it.next().search(bounds, collection);
                }
            } else if (this.mItems != null) {
                if (bounds.contains(this.mBounds)) {
                    collection.addAll(this.mItems);
                    return;
                }
                for (T t : this.mItems) {
                    if (bounds.contains(t.getPoint())) {
                        collection.add(t);
                    }
                }
            }
        }
    }
}
