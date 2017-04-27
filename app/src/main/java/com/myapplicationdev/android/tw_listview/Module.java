package com.myapplicationdev.android.tw_listview;

/**
 * Created by 15017274 on 27/4/2017.
 */

public class Module {
    private String name;
    private boolean prog;
    public Module(String name, boolean prog) {
        this.name = name;
        this.prog = prog;
    }
    public String getName() {
        return name;
    }
    public boolean isProg() {
        return prog;
    }
}
