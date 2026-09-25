package androidx.constraintlayout.solver.widgets;

/* JADX INFO: loaded from: classes.dex */
class Chain {
    private static final boolean DEBUG = false;

    Chain() {
    }

    static void applyChainConstraints(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer constraintWidgetContainer, androidx.constraintlayout.solver.LinearSystem linearSystem, int i) {
        int i2;
        int i3;
        androidx.constraintlayout.solver.widgets.ChainHead[] chainHeadArr;
        if (i == 0) {
            int i4 = constraintWidgetContainer.mHorizontalChainsSize;
            chainHeadArr = constraintWidgetContainer.mHorizontalChainsArray;
            i3 = i4;
            i2 = 0;
        } else {
            i2 = 2;
            i3 = constraintWidgetContainer.mVerticalChainsSize;
            chainHeadArr = constraintWidgetContainer.mVerticalChainsArray;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            androidx.constraintlayout.solver.widgets.ChainHead chainHead = chainHeadArr[i5];
            chainHead.define();
            applyChainConstraints(constraintWidgetContainer, linearSystem, i, i2, chainHead);
        }
    }

    /* JADX WARN: Code duplicated, block: B:154:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:29:0x004a A[PHI: r8 r14
      0x004a: PHI (r8v4 boolean) = (r8v2 boolean), (r8v47 boolean) binds: [B:28:0x0048, B:17:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x004a: PHI (r14v4 boolean) = (r14v2 boolean), (r14v33 boolean) binds: [B:28:0x0048, B:17:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x004c A[PHI: r8 r14
      0x004c: PHI (r8v44 boolean) = (r8v2 boolean), (r8v47 boolean) binds: [B:28:0x0048, B:17:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x004c: PHI (r14v30 boolean) = (r14v2 boolean), (r14v33 boolean) binds: [B:28:0x0048, B:17:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r37v0, types: [androidx.constraintlayout.solver.LinearSystem] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27, types: [androidx.constraintlayout.solver.SolverVariable] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [androidx.constraintlayout.solver.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    static void applyChainConstraints(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer constraintWidgetContainer, androidx.constraintlayout.solver.LinearSystem linearSystem, int i, int i2, androidx.constraintlayout.solver.widgets.ChainHead chainHead) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor;
        androidx.constraintlayout.solver.SolverVariable solverVariable;
        androidx.constraintlayout.solver.SolverVariable solverVariable2;
        androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor2;
        androidx.constraintlayout.solver.SolverVariable solverVariable3;
        androidx.constraintlayout.solver.SolverVariable solverVariable4;
        ?? r5;
        float f;
        int size;
        int i5;
        int i6;
        androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget = chainHead.mFirst;
        androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget2 = chainHead.mLast;
        androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget3 = chainHead.mFirstVisibleWidget;
        androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget4 = chainHead.mLastVisibleWidget;
        androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget5 = chainHead.mHead;
        float f2 = chainHead.mTotalWeight;
        androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget6 = chainHead.mFirstMatchConstraintWidget;
        androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget7 = chainHead.mLastMatchConstraintWidget;
        boolean z4 = constraintWidgetContainer.mListDimensionBehaviors[i] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (i == 0) {
            z = constraintWidget5.mHorizontalChainStyle == 0;
            z2 = constraintWidget5.mHorizontalChainStyle == 1;
            if (constraintWidget5.mHorizontalChainStyle == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z = constraintWidget5.mVerticalChainStyle == 0;
            z2 = constraintWidget5.mVerticalChainStyle == 1;
            if (constraintWidget5.mVerticalChainStyle == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        ?? r7 = constraintWidget;
        boolean z5 = z2;
        boolean z6 = z;
        boolean z7 = false;
        while (true) {
            java.lang.Object obj = null;
            if (z7) {
                break;
            }
            androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor3 = r7.mListAnchors[i2];
            int i7 = (z4 || z3) ? 1 : 4;
            int margin = constraintAnchor3.getMargin();
            float f3 = f2;
            if (constraintAnchor3.mTarget != null && r7 != constraintWidget) {
                margin += constraintAnchor3.mTarget.getMargin();
            }
            int i8 = margin;
            if (!z3 || r7 == constraintWidget || r7 == constraintWidget3) {
                i5 = (z6 && z4) ? 4 : i7;
            } else {
                i5 = 6;
            }
            if (constraintAnchor3.mTarget != null) {
                if (r7 == constraintWidget3) {
                    linearSystem.addGreaterThan(constraintAnchor3.mSolverVariable, constraintAnchor3.mTarget.mSolverVariable, i8, 5);
                } else {
                    linearSystem.addGreaterThan(constraintAnchor3.mSolverVariable, constraintAnchor3.mTarget.mSolverVariable, i8, 6);
                }
                linearSystem.addEquality(constraintAnchor3.mSolverVariable, constraintAnchor3.mTarget.mSolverVariable, i8, i5);
            } else {
                constraintWidget5 = constraintWidget5;
                z6 = z6;
            }
            if (z4) {
                if (r7.getVisibility() == 8 || r7.mListDimensionBehaviors[i] != androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i6 = 0;
                } else {
                    i6 = 0;
                    linearSystem.addGreaterThan(r7.mListAnchors[i2 + 1].mSolverVariable, r7.mListAnchors[i2].mSolverVariable, 0, 5);
                }
                linearSystem.addGreaterThan(r7.mListAnchors[i2].mSolverVariable, constraintWidgetContainer.mListAnchors[i2].mSolverVariable, i6, 6);
            }
            androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor4 = r7.mListAnchors[i2 + 1].mTarget;
            if (constraintAnchor4 != null) {
                androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget8 = constraintAnchor4.mOwner;
                if (constraintWidget8.mListAnchors[i2].mTarget != null && constraintWidget8.mListAnchors[i2].mTarget.mOwner == r7) {
                    obj = constraintWidget8;
                }
            }
            if (obj != null) {
                r7 = obj;
                z7 = z7;
            } else {
                z7 = true;
            }
            z5 = z5;
            f2 = f3;
            z6 = z6;
            constraintWidget5 = constraintWidget5;
            r7 = r7;
        }
        androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget9 = constraintWidget5;
        float f4 = f2;
        boolean z8 = z6;
        boolean z9 = z5;
        if (constraintWidget4 != null) {
            int i9 = i2 + 1;
            if (constraintWidget2.mListAnchors[i9].mTarget != null) {
                androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor5 = constraintWidget4.mListAnchors[i9];
                linearSystem.addLowerThan(constraintAnchor5.mSolverVariable, constraintWidget2.mListAnchors[i9].mTarget.mSolverVariable, -constraintAnchor5.getMargin(), 5);
            }
        }
        if (z4) {
            int i10 = i2 + 1;
            linearSystem.addGreaterThan(constraintWidgetContainer.mListAnchors[i10].mSolverVariable, constraintWidget2.mListAnchors[i10].mSolverVariable, constraintWidget2.mListAnchors[i10].getMargin(), 6);
        }
        java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> arrayList = chainHead.mWeightedMatchConstraintsWidgets;
        if (arrayList != null && (size = arrayList.size()) > 1) {
            float f5 = (!chainHead.mHasUndefinedWeights || chainHead.mHasComplexMatchWeights) ? f4 : chainHead.mWidgetsMatchCount;
            float f6 = 0.0f;
            androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget10 = null;
            int i11 = 0;
            float f7 = 0.0f;
            while (i11 < size) {
                androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget11 = arrayList.get(i11);
                float f8 = constraintWidget11.mWeight[i];
                if (f8 < f6) {
                    if (chainHead.mHasComplexMatchWeights) {
                        linearSystem.addEquality(constraintWidget11.mListAnchors[i2 + 1].mSolverVariable, constraintWidget11.mListAnchors[i2].mSolverVariable, 0, 4);
                    } else {
                        f8 = 1.0f;
                    }
                    arrayList = arrayList;
                    size = size;
                    i11++;
                    size = size;
                    arrayList = arrayList;
                    f6 = 0.0f;
                }
                if (f8 == 0.0f) {
                    linearSystem.addEquality(constraintWidget11.mListAnchors[i2 + 1].mSolverVariable, constraintWidget11.mListAnchors[i2].mSolverVariable, 0, 6);
                    arrayList = arrayList;
                    size = size;
                } else {
                    if (constraintWidget10 != null) {
                        androidx.constraintlayout.solver.SolverVariable solverVariable5 = constraintWidget10.mListAnchors[i2].mSolverVariable;
                        int i12 = i2 + 1;
                        androidx.constraintlayout.solver.SolverVariable solverVariable6 = constraintWidget10.mListAnchors[i12].mSolverVariable;
                        androidx.constraintlayout.solver.SolverVariable solverVariable7 = constraintWidget11.mListAnchors[i2].mSolverVariable;
                        androidx.constraintlayout.solver.SolverVariable solverVariable8 = constraintWidget11.mListAnchors[i12].mSolverVariable;
                        androidx.constraintlayout.solver.ArrayRow arrayRowCreateRow = linearSystem.createRow();
                        arrayRowCreateRow.createRowEqualMatchDimensions(f7, f5, f8, solverVariable5, solverVariable6, solverVariable7, solverVariable8);
                        linearSystem.addConstraint(arrayRowCreateRow);
                    }
                    constraintWidget10 = constraintWidget11;
                    f7 = f8;
                }
                i11++;
                size = size;
                arrayList = arrayList;
                f6 = 0.0f;
            }
        }
        if (constraintWidget3 != null && (constraintWidget3 == constraintWidget4 || z3)) {
            androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor6 = constraintWidget.mListAnchors[i2];
            int i13 = i2 + 1;
            androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor7 = constraintWidget2.mListAnchors[i13];
            androidx.constraintlayout.solver.SolverVariable solverVariable9 = constraintWidget.mListAnchors[i2].mTarget != null ? constraintWidget.mListAnchors[i2].mTarget.mSolverVariable : null;
            androidx.constraintlayout.solver.SolverVariable solverVariable10 = constraintWidget2.mListAnchors[i13].mTarget != null ? constraintWidget2.mListAnchors[i13].mTarget.mSolverVariable : null;
            if (constraintWidget3 == constraintWidget4) {
                constraintAnchor6 = constraintWidget3.mListAnchors[i2];
                constraintAnchor7 = constraintWidget3.mListAnchors[i13];
            }
            if (solverVariable9 != null && solverVariable10 != null) {
                if (i == 0) {
                    f = constraintWidget9.mHorizontalBiasPercent;
                } else {
                    f = constraintWidget9.mVerticalBiasPercent;
                }
                linearSystem.addCentering(constraintAnchor6.mSolverVariable, solverVariable9, constraintAnchor6.getMargin(), f, solverVariable10, constraintAnchor7.mSolverVariable, constraintAnchor7.getMargin(), 5);
            }
        } else if (!z8 || constraintWidget3 == null) {
            int i14 = 8;
            if (z9 && constraintWidget3 != null) {
                boolean z10 = chainHead.mWidgetsMatchCount > 0 && chainHead.mWidgetsCount == chainHead.mWidgetsMatchCount;
                androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget12 = constraintWidget3;
                androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget13 = constraintWidget12;
                while (constraintWidget12 != null) {
                    androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget14 = constraintWidget12.mNextChainWidget[i];
                    while (constraintWidget14 != null && constraintWidget14.getVisibility() == i14) {
                        constraintWidget14 = constraintWidget14.mNextChainWidget[i];
                    }
                    if (constraintWidget12 == constraintWidget3 || constraintWidget12 == constraintWidget4 || constraintWidget14 == null) {
                        constraintWidget13 = constraintWidget13;
                        i4 = 8;
                    } else {
                        androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget15 = constraintWidget14 == constraintWidget4 ? null : constraintWidget14;
                        androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor8 = constraintWidget12.mListAnchors[i2];
                        androidx.constraintlayout.solver.SolverVariable solverVariable11 = constraintAnchor8.mSolverVariable;
                        if (constraintAnchor8.mTarget != null) {
                            androidx.constraintlayout.solver.SolverVariable solverVariable12 = constraintAnchor8.mTarget.mSolverVariable;
                        }
                        int i15 = i2 + 1;
                        androidx.constraintlayout.solver.SolverVariable solverVariable13 = constraintWidget13.mListAnchors[i15].mSolverVariable;
                        int margin2 = constraintAnchor8.getMargin();
                        int margin3 = constraintWidget12.mListAnchors[i15].getMargin();
                        if (constraintWidget15 != null) {
                            constraintAnchor = constraintWidget15.mListAnchors[i2];
                            solverVariable = constraintAnchor.mSolverVariable;
                            solverVariable2 = constraintAnchor.mTarget != null ? constraintAnchor.mTarget.mSolverVariable : null;
                        } else {
                            constraintAnchor = constraintWidget12.mListAnchors[i15].mTarget;
                            solverVariable = constraintAnchor != null ? constraintAnchor.mSolverVariable : null;
                            solverVariable2 = constraintWidget12.mListAnchors[i15].mSolverVariable;
                        }
                        if (constraintAnchor != null) {
                            margin3 += constraintAnchor.getMargin();
                        }
                        int i16 = margin3;
                        if (constraintWidget13 != null) {
                            margin2 += constraintWidget13.mListAnchors[i15].getMargin();
                        }
                        int i17 = margin2;
                        int i18 = z10 ? 6 : 4;
                        if (solverVariable11 == null || solverVariable13 == null || solverVariable == null || solverVariable2 == null) {
                            i4 = 8;
                        } else {
                            i4 = 8;
                            linearSystem.addCentering(solverVariable11, solverVariable13, i17, 0.5f, solverVariable, solverVariable2, i16, i18);
                        }
                        constraintWidget14 = constraintWidget15;
                    }
                    if (constraintWidget12.getVisibility() == i4) {
                        constraintWidget12 = constraintWidget13;
                    }
                    constraintWidget13 = constraintWidget12;
                    i14 = 8;
                    constraintWidget12 = constraintWidget14;
                }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor9 = constraintWidget3.mListAnchors[i2];
                androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor10 = constraintWidget.mListAnchors[i2].mTarget;
                int i19 = i2 + 1;
                androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor11 = constraintWidget4.mListAnchors[i19];
                androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor12 = constraintWidget2.mListAnchors[i19].mTarget;
                if (constraintAnchor10 == null) {
                    i3 = 4;
                } else if (constraintWidget3 != constraintWidget4) {
                    i3 = 4;
                    linearSystem.addEquality(constraintAnchor9.mSolverVariable, constraintAnchor10.mSolverVariable, constraintAnchor9.getMargin(), 4);
                } else {
                    i3 = 4;
                    if (constraintAnchor12 != null) {
                        linearSystem.addCentering(constraintAnchor9.mSolverVariable, constraintAnchor10.mSolverVariable, constraintAnchor9.getMargin(), 0.5f, constraintAnchor11.mSolverVariable, constraintAnchor12.mSolverVariable, constraintAnchor11.getMargin(), 4);
                    }
                }
                if (constraintAnchor12 != null && constraintWidget3 != constraintWidget4) {
                    linearSystem.addEquality(constraintAnchor11.mSolverVariable, constraintAnchor12.mSolverVariable, -constraintAnchor11.getMargin(), i3);
                }
            }
        } else {
            boolean z11 = chainHead.mWidgetsMatchCount > 0 && chainHead.mWidgetsCount == chainHead.mWidgetsMatchCount;
            androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget16 = constraintWidget3;
            androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget17 = constraintWidget16;
            while (constraintWidget16 != null) {
                androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget18 = constraintWidget16.mNextChainWidget[i];
                while (constraintWidget18 != null && constraintWidget18.getVisibility() == 8) {
                    constraintWidget18 = constraintWidget18.mNextChainWidget[i];
                }
                if (constraintWidget18 != null || constraintWidget16 == constraintWidget4) {
                    androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor13 = constraintWidget16.mListAnchors[i2];
                    androidx.constraintlayout.solver.SolverVariable solverVariable14 = constraintAnchor13.mSolverVariable;
                    androidx.constraintlayout.solver.SolverVariable solverVariable15 = constraintAnchor13.mTarget != null ? constraintAnchor13.mTarget.mSolverVariable : null;
                    if (constraintWidget17 != constraintWidget16) {
                        solverVariable15 = constraintWidget17.mListAnchors[i2 + 1].mSolverVariable;
                    } else if (constraintWidget16 == constraintWidget3 && constraintWidget17 == constraintWidget16) {
                        solverVariable15 = constraintWidget.mListAnchors[i2].mTarget != null ? constraintWidget.mListAnchors[i2].mTarget.mSolverVariable : null;
                    }
                    int margin4 = constraintAnchor13.getMargin();
                    int i20 = i2 + 1;
                    int margin5 = constraintWidget16.mListAnchors[i20].getMargin();
                    if (constraintWidget18 != null) {
                        constraintAnchor2 = constraintWidget18.mListAnchors[i2];
                        androidx.constraintlayout.solver.SolverVariable solverVariable16 = constraintAnchor2.mSolverVariable;
                        solverVariable4 = constraintWidget16.mListAnchors[i20].mSolverVariable;
                        solverVariable3 = solverVariable16;
                    } else {
                        constraintAnchor2 = constraintWidget2.mListAnchors[i20].mTarget;
                        solverVariable3 = constraintAnchor2 != null ? constraintAnchor2.mSolverVariable : null;
                        solverVariable4 = constraintWidget16.mListAnchors[i20].mSolverVariable;
                    }
                    if (constraintAnchor2 != null) {
                        margin5 += constraintAnchor2.getMargin();
                    }
                    if (constraintWidget17 != null) {
                        margin4 += constraintWidget17.mListAnchors[i20].getMargin();
                    }
                    if (solverVariable14 != null && solverVariable15 != null && solverVariable3 != null && solverVariable4 != null) {
                        if (constraintWidget16 == constraintWidget3) {
                            margin4 = constraintWidget3.mListAnchors[i2].getMargin();
                        }
                        linearSystem.addCentering(solverVariable14, solverVariable15, margin4, 0.5f, solverVariable3, solverVariable4, constraintWidget16 == constraintWidget4 ? constraintWidget4.mListAnchors[i20].getMargin() : margin5, z11 ? 6 : 4);
                    }
                }
                if (constraintWidget16.getVisibility() != 8) {
                    constraintWidget17 = constraintWidget16;
                }
                constraintWidget16 = constraintWidget18;
            }
        }
        if ((z8 || z9) && constraintWidget3 != null) {
            androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor14 = constraintWidget3.mListAnchors[i2];
            int i21 = i2 + 1;
            androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor15 = constraintWidget4.mListAnchors[i21];
            androidx.constraintlayout.solver.SolverVariable solverVariable17 = constraintAnchor14.mTarget != null ? constraintAnchor14.mTarget.mSolverVariable : null;
            androidx.constraintlayout.solver.SolverVariable solverVariable18 = constraintAnchor15.mTarget != null ? constraintAnchor15.mTarget.mSolverVariable : null;
            if (constraintWidget2 != constraintWidget4) {
                androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor16 = constraintWidget2.mListAnchors[i21];
                r5 = constraintAnchor16.mTarget != null ? constraintAnchor16.mTarget.mSolverVariable : null;
            } else {
                r5 = solverVariable18;
            }
            if (constraintWidget3 == constraintWidget4) {
                constraintAnchor14 = constraintWidget3.mListAnchors[i2];
                constraintAnchor15 = constraintWidget3.mListAnchors[i21];
            }
            if (solverVariable17 == null || r5 == 0) {
                return;
            }
            int margin6 = constraintAnchor14.getMargin();
            if (constraintWidget4 != null) {
                constraintWidget2 = constraintWidget4;
            }
            linearSystem.addCentering(constraintAnchor14.mSolverVariable, solverVariable17, margin6, 0.5f, r5, constraintAnchor15.mSolverVariable, constraintWidget2.mListAnchors[i21].getMargin(), 5);
        }
    }
}
