// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
/**
 * {@snippet :
 * struct _GtkCheckButton {
 *     struct _GtkToggleButton toggle_button;
 * };
 * }
 */
public class _GtkCheckButton {

    public static MemoryLayout $LAYOUT() {
        return constants$2608.const$5;
    }
    public static MemorySegment toggle_button$slice(MemorySegment seg) {
        return seg.asSlice(0, 64);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

