package org.purejava.appindicator;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentScope;

public class MemoryAllocator {
    public static MemorySegment ALLOCATE_FOR(String str) {
        return RuntimeHelper.CONSTANT_ALLOCATOR.allocateUtf8String(str);
    }

    public static MemorySegment ALLOCATE_CALLBACK_FOR(GCallback cb, SegmentScope scope) {
        return GCallback.allocate(cb, scope);
    }

    public static boolean isLoadedNativeLib() {
        return RuntimeHelper.isLoaded();
    }
}
