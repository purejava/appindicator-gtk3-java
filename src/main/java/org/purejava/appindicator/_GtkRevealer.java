// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * struct _GtkRevealer {
 *     GtkBin parent_instance;
 * };
 * }
 */
public class _GtkRevealer {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.structLayout(
                        MemoryLayout.structLayout(
                            Constants$root.C_POINTER$LAYOUT.withName("g_class")
                        ).withName("g_type_instance"),
                        Constants$root.C_INT$LAYOUT.withName("ref_count"),
                        MemoryLayout.paddingLayout(32),
                        Constants$root.C_POINTER$LAYOUT.withName("qdata")
                    ).withName("parent_instance"),
                    Constants$root.C_POINTER$LAYOUT.withName("priv")
                ).withName("widget"),
                Constants$root.C_POINTER$LAYOUT.withName("priv")
            ).withName("container"),
            Constants$root.C_POINTER$LAYOUT.withName("priv")
        ).withName("parent_instance")
    ).withName("_GtkRevealer");
    public static MemoryLayout $LAYOUT() {
        return _GtkRevealer.$struct$LAYOUT;
    }
    public static MemorySegment parent_instance$slice(MemorySegment seg) {
        return seg.asSlice(0, 48);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


