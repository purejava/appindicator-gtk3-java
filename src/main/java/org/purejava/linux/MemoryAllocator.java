package org.purejava.linux;

import java.lang.foreign.MemorySegment;

public class MemoryAllocator {
    public static MemorySegment ALLOCATE_FOR(String str) {
        return RuntimeHelper.CONSTANT_ALLOCATOR.allocateUtf8String(str);
    }
}
