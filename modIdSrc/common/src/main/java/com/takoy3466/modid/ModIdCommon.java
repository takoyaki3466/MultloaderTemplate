package com.takoy3466.modid;

import com.takoy3466.modid.init.*;

public class ModIdCommon {

    public static final String MOD_ID = "modid";

    private ModIdCommon() {
    }

    public static void init() {
        CompatData.init();
        CompatItems.init();
        CompatBlocks.init();
        CompatTabs.init();
        CompatMenus.init();
    }
}
