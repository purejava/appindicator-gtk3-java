// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GParamSpecPointer {
 *     GParamSpec parent_instance;
 * };
 * }
 */
public class _GParamSpecPointer {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("g_class")
            ).withName("g_type_instance"),
            Constants$root.C_POINTER$LAYOUT.withName("name"),
            Constants$root.C_INT$LAYOUT.withName("flags"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_LONG_LONG$LAYOUT.withName("value_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("owner_type"),
            Constants$root.C_POINTER$LAYOUT.withName("_nick"),
            Constants$root.C_POINTER$LAYOUT.withName("_blurb"),
            Constants$root.C_POINTER$LAYOUT.withName("qdata"),
            Constants$root.C_INT$LAYOUT.withName("ref_count"),
            Constants$root.C_INT$LAYOUT.withName("param_id")
        ).withName("parent_instance")
    ).withName("_GParamSpecPointer");
    public static MemoryLayout $LAYOUT() {
        return _GParamSpecPointer.$struct$LAYOUT;
    }
    public static MemorySegment parent_instance$slice(MemorySegment seg) {
        return seg.asSlice(0, 72);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


