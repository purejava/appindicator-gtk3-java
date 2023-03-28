package org.purejava.linux;

import java.lang.foreign.MemorySegment;

public class Appindicator {
    public static MemorySegment APPINDICATOR = RuntimeHelper.CONSTANT_ALLOCATOR.allocate(AppIndicator.$LAYOUT());
    private final String id;
    private final String icon_name;
    private final int category;

    public Appindicator(String id, String icon_name, int category) {
        this.id = id;
        this.icon_name = icon_name;
        this.category = category;
    }

    public static MemorySegment ALLOCATE_FOR(String str) {
        return RuntimeHelper.CONSTANT_ALLOCATOR.allocateUtf8String(str);
    }
}
