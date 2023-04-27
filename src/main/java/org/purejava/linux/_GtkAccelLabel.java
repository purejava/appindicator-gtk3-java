// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkAccelLabel {
 *     GtkLabel label;
 *     GtkAccelLabelPrivate* priv;
 * };
 * }
 */
public class _GtkAccelLabel {

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
            ).withName("misc"),
            Constants$root.C_POINTER$LAYOUT.withName("priv")
        ).withName("label"),
        Constants$root.C_POINTER$LAYOUT.withName("priv")
    ).withName("_GtkAccelLabel");
    public static MemoryLayout $LAYOUT() {
        return _GtkAccelLabel.$struct$LAYOUT;
    }
    public static MemorySegment label$slice(MemorySegment seg) {
        return seg.asSlice(0, 48);
    }
    static final VarHandle priv$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("priv"));
    public static VarHandle priv$VH() {
        return _GtkAccelLabel.priv$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GtkAccelLabelPrivate* priv;
     * }
     */
    public static MemorySegment priv$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkAccelLabel.priv$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GtkAccelLabelPrivate* priv;
     * }
     */
    public static void priv$set(MemorySegment seg, MemorySegment x) {
        _GtkAccelLabel.priv$VH.set(seg, x);
    }
    public static MemorySegment priv$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkAccelLabel.priv$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void priv$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkAccelLabel.priv$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


