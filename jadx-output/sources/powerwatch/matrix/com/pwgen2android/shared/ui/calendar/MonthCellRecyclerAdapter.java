package powerwatch.matrix.com.pwgen2android.shared.ui.calendar;

/* JADX INFO: compiled from: CalendarView.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\u0014\u0010\u0019\u001a\u00020\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J)\u0010\u001a\u001a\u00020\r2!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u0007\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter$MonthCellViewHolder;", "()V", "items", "", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCell;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;", "Lkotlin/ParameterName;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "dayCell", "", "getCurrentItem", "currentItemPosition", "", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "setListener", "MonthCellViewHolder", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class MonthCellRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<powerwatch.matrix.com.pwgen2android.shared.ui.calendar.MonthCellRecyclerAdapter.MonthCellViewHolder> {
    private java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.calendar.MonthCell> items = kotlin.collections.CollectionsKt.emptyList();
    private kotlin.jvm.functions.Function1<? super powerwatch.matrix.com.pwgen2android.shared.ui.calendar.DayCell, kotlin.Unit> listener;

    public final void setListener(kotlin.jvm.functions.Function1<? super powerwatch.matrix.com.pwgen2android.shared.ui.calendar.DayCell, kotlin.Unit> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    public final void setData(java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.calendar.MonthCell> items) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "items");
        if (!items.isEmpty()) {
            this.items = items;
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public powerwatch.matrix.com.pwgen2android.shared.ui.calendar.MonthCellRecyclerAdapter.MonthCellViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parent, "parent");
        android.view.LayoutInflater inflater = android.view.LayoutInflater.from(parent.getContext());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflater, "inflater");
        android.view.View viewInflate = inflater.inflate(powerwatch.matrix.com.pwgen2android.R.layout.calendar_month_cell, parent, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewInflate, "inflater.inflate(R.layout.calendar_month_cell, parent, false)");
        return new powerwatch.matrix.com.pwgen2android.shared.ui.calendar.MonthCellRecyclerAdapter.MonthCellViewHolder(inflater, viewInflate, this.listener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(powerwatch.matrix.com.pwgen2android.shared.ui.calendar.MonthCellRecyclerAdapter.MonthCellViewHolder holder, int position) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position));
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.calendar.MonthCell getCurrentItem(int currentItemPosition) {
        return this.items.get(currentItemPosition);
    }

    /* JADX INFO: compiled from: CalendarView.kt */
    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B:\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012#\u0010\u0006\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007¢\u0006\u0002\u0010\rJ\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0006\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter$MonthCellViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "inflater", "Landroid/view/LayoutInflater;", "itemView", "Landroid/view/View;", "itemListener", "Lkotlin/Function1;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;", "Lkotlin/ParameterName;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "dayCell", "", "(Landroid/view/LayoutInflater;Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "weeksContainer", "Landroid/widget/LinearLayout;", "kotlin.jvm.PlatformType", "bind", "monthCell", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCell;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class MonthCellViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.view.LayoutInflater inflater;
        private final kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.shared.ui.calendar.DayCell, kotlin.Unit> itemListener;
        private final android.widget.LinearLayout weeksContainer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public MonthCellViewHolder(android.view.LayoutInflater inflater, android.view.View itemView, kotlin.jvm.functions.Function1<? super powerwatch.matrix.com.pwgen2android.shared.ui.calendar.DayCell, kotlin.Unit> function1) {
            super(itemView);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.inflater = inflater;
            this.itemListener = function1;
            this.weeksContainer = (android.widget.LinearLayout) this.itemView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.calendar_weeks_content);
        }

        public final void bind(powerwatch.matrix.com.pwgen2android.shared.ui.calendar.MonthCell monthCell) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monthCell, "monthCell");
            android.content.Context context = this.itemView.getContext();
            ((android.widget.TextView) this.itemView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.month_title)).setText(monthCell.getLabel());
            for (powerwatch.matrix.com.pwgen2android.shared.ui.calendar.WeekRow weekRow : monthCell.getWeeks()) {
                android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
                for (final powerwatch.matrix.com.pwgen2android.shared.ui.calendar.DayCell dayCell : weekRow.getDays()) {
                    android.view.View viewInflate = this.inflater.inflate(powerwatch.matrix.com.pwgen2android.R.layout.calendar_day_cell, (android.view.ViewGroup) linearLayout, false);
                    android.view.View viewFindViewById = viewInflate.findViewById(powerwatch.matrix.com.pwgen2android.R.id.goal_indicator);
                    android.view.View viewFindViewById2 = viewInflate.findViewById(powerwatch.matrix.com.pwgen2android.R.id.day_divider);
                    if (dayCell != null) {
                        viewFindViewById2.setVisibility(0);
                        android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(powerwatch.matrix.com.pwgen2android.R.id.day_cell_title);
                        textView.setText(dayCell.getLabel());
                        textView.setVisibility(0);
                        if (dayCell.getGoalAchieved()) {
                            viewFindViewById.setBackground(androidx.core.content.ContextCompat.getDrawable(context, powerwatch.matrix.com.pwgen2android.R.drawable.green_circle));
                        } else {
                            viewFindViewById.setBackground(androidx.core.content.ContextCompat.getDrawable(context, powerwatch.matrix.com.pwgen2android.R.drawable.circle));
                        }
                        if (dayCell.isToday()) {
                            textView.setBackground(androidx.core.content.ContextCompat.getDrawable(context, powerwatch.matrix.com.pwgen2android.R.drawable.circular_text_view));
                        } else {
                            textView.setBackground(null);
                            textView.setBackgroundColor(androidx.core.content.ContextCompat.getColor(context, android.R.color.transparent));
                            if (dayCell.isDayOfWeekend()) {
                                textView.setTextColor(androidx.core.content.ContextCompat.getColor(context, powerwatch.matrix.com.pwgen2android.R.color.grey));
                            } else {
                                textView.setTextColor(androidx.core.content.ContextCompat.getColor(context, powerwatch.matrix.com.pwgen2android.R.color.white));
                            }
                        }
                        viewInflate.setOnClickListener(new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.calendar.-$$Lambda$MonthCellRecyclerAdapter$MonthCellViewHolder$ov_iCvQndF_oQdYjppmQCFgjOSE
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                powerwatch.matrix.com.pwgen2android.shared.ui.calendar.MonthCellRecyclerAdapter.MonthCellViewHolder.m3443bind$lambda2$lambda1$lambda0(this.f$0, dayCell, view);
                            }
                        });
                    } else {
                        viewFindViewById2.setVisibility(4);
                    }
                    linearLayout.addView(viewInflate);
                }
                int size = 7 - weekRow.getDays().size();
                int i = 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = i + 1;
                        linearLayout.addView(this.inflater.inflate(powerwatch.matrix.com.pwgen2android.R.layout.calendar_day_cell, (android.view.ViewGroup) linearLayout, false));
                        if (i == size) {
                            break;
                        } else {
                            i = i2;
                        }
                    }
                }
                this.weeksContainer.addView(linearLayout);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: bind$lambda-2$lambda-1$lambda-0, reason: not valid java name */
        public static final void m3443bind$lambda2$lambda1$lambda0(powerwatch.matrix.com.pwgen2android.shared.ui.calendar.MonthCellRecyclerAdapter.MonthCellViewHolder this$0, powerwatch.matrix.com.pwgen2android.shared.ui.calendar.DayCell dayCell, android.view.View view) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.shared.ui.calendar.DayCell, kotlin.Unit> function1 = this$0.itemListener;
            if (function1 == null) {
                return;
            }
            function1.invoke(dayCell);
        }
    }
}
