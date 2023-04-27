// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkColorSelection {
 *     GtkBox parent_instance;
 *     GtkColorSelectionPrivate* private_data;
 * };
 * }
 */
public class _GtkColorSelection {

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
        ).withName("parent_instance"),
        Constants$root.C_POINTER$LAYOUT.withName("private_data")
    ).withName("_GtkColorSelection");
    public static MemoryLayout $LAYOUT() {
        return _GtkColorSelection.$struct$LAYOUT;
    }
    public static MemorySegment parent_instance$slice(MemorySegment seg) {
        return seg.asSlice(0, 48);
    }
    static final VarHandle private_data$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("private_data"));
    public static VarHandle private_data$VH() {
        return _GtkColorSelection.private_data$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GtkColorSelectionPrivate* private_data;
     * }
     */
    public static MemorySegment private_data$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkColorSelection.private_data$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GtkColorSelectionPrivate* private_data;
     * }
     */
    public static void private_data$set(MemorySegment seg, MemorySegment x) {
        _GtkColorSelection.private_data$VH.set(seg, x);
    }
    public static MemorySegment private_data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkColorSelection.private_data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void private_data$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkColorSelection.private_data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


