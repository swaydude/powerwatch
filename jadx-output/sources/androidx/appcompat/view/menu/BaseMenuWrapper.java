package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
abstract class BaseMenuWrapper {
    final android.content.Context mContext;
    private java.util.Map<androidx.core.internal.view.SupportMenuItem, android.view.MenuItem> mMenuItems;
    private java.util.Map<androidx.core.internal.view.SupportSubMenu, android.view.SubMenu> mSubMenus;

    BaseMenuWrapper(android.content.Context context) {
        this.mContext = context;
    }

    final android.view.MenuItem getMenuItemWrapper(android.view.MenuItem menuItem) {
        if (!(menuItem instanceof androidx.core.internal.view.SupportMenuItem)) {
            return menuItem;
        }
        androidx.core.internal.view.SupportMenuItem supportMenuItem = (androidx.core.internal.view.SupportMenuItem) menuItem;
        if (this.mMenuItems == null) {
            this.mMenuItems = new androidx.collection.ArrayMap();
        }
        android.view.MenuItem menuItem2 = this.mMenuItems.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        androidx.appcompat.view.menu.MenuItemWrapperICS menuItemWrapperICS = new androidx.appcompat.view.menu.MenuItemWrapperICS(this.mContext, supportMenuItem);
        this.mMenuItems.put(supportMenuItem, menuItemWrapperICS);
        return menuItemWrapperICS;
    }

    final android.view.SubMenu getSubMenuWrapper(android.view.SubMenu subMenu) {
        if (!(subMenu instanceof androidx.core.internal.view.SupportSubMenu)) {
            return subMenu;
        }
        androidx.core.internal.view.SupportSubMenu supportSubMenu = (androidx.core.internal.view.SupportSubMenu) subMenu;
        if (this.mSubMenus == null) {
            this.mSubMenus = new androidx.collection.ArrayMap();
        }
        android.view.SubMenu subMenu2 = this.mSubMenus.get(supportSubMenu);
        if (subMenu2 != null) {
            return subMenu2;
        }
        androidx.appcompat.view.menu.SubMenuWrapperICS subMenuWrapperICS = new androidx.appcompat.view.menu.SubMenuWrapperICS(this.mContext, supportSubMenu);
        this.mSubMenus.put(supportSubMenu, subMenuWrapperICS);
        return subMenuWrapperICS;
    }

    final void internalClear() {
        java.util.Map<androidx.core.internal.view.SupportMenuItem, android.view.MenuItem> map = this.mMenuItems;
        if (map != null) {
            map.clear();
        }
        java.util.Map<androidx.core.internal.view.SupportSubMenu, android.view.SubMenu> map2 = this.mSubMenus;
        if (map2 != null) {
            map2.clear();
        }
    }

    final void internalRemoveGroup(int i) {
        java.util.Map<androidx.core.internal.view.SupportMenuItem, android.view.MenuItem> map = this.mMenuItems;
        if (map == null) {
            return;
        }
        java.util.Iterator<androidx.core.internal.view.SupportMenuItem> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i == it.next().getGroupId()) {
                it.remove();
            }
        }
    }

    final void internalRemoveItem(int i) {
        java.util.Map<androidx.core.internal.view.SupportMenuItem, android.view.MenuItem> map = this.mMenuItems;
        if (map == null) {
            return;
        }
        java.util.Iterator<androidx.core.internal.view.SupportMenuItem> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i == it.next().getItemId()) {
                it.remove();
                return;
            }
        }
    }
}
