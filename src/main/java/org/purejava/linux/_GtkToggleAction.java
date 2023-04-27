// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkToggleAction {
 *     GtkAction parent;
 *     GtkToggleActionPrivate* private_data;
 * };
 * }
 */
public class _GtkToggleAction {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_POINTER$LAYOUT.withName("g_class")
                ).withName("g_type_instance"),
                Constants$root.C_INT$LAYOUT.withName("ref_count"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("qdata")
            ).withName("object"),
            Constants$root.C_POINTER$LAYOUT.withName("private_data")
        ).withName("parent"),
        Constants$root.C_POINTER$LAYOUT.withName("private_data")
    ).withName("_GtkToggleAction");
    public static MemoryLayout $LAYOUT() {
        return _GtkToggleAction.$struct$LAYOUT;
    }
    public static MemorySegment parent$slice(MemorySegment seg) {
        return seg.asSlice(0, 32);
    }
    static final VarHandle private_data$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("private_data"));
    public static VarHandle private_data$VH() {
        return _GtkToggleAction.private_data$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GtkToggleActionPrivate* private_data;
     * }
     */
    public static MemorySegment private_data$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkToggleAction.private_data$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GtkToggleActionPrivate* private_data;
     * }
     */
    public static void private_data$set(MemorySegment seg, MemorySegment x) {
        _GtkToggleAction.private_data$VH.set(seg, x);
    }
    public static MemorySegment private_data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkToggleAction.private_data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void private_data$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkToggleAction.private_data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


