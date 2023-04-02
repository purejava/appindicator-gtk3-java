package org.purejava.linux;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySession;

public class MemoryAllocator {
    public static MemorySegment ALLOCATE_FOR(String str) {
        return RuntimeHelper.CONSTANT_ALLOCATOR.allocateUtf8String(str);
    }

    public static MemorySegment ALLOCATE_CALLBACK_FOR(GCallback cb, MemorySession session) {
        return GCallback.allocate(cb, session);
    }
}
