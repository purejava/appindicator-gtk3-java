// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct _GtkAppChooserButton {
 *     GtkComboBox parent;
 *     GtkAppChooserButtonPrivate* priv;
 * };
 * }
 */
public class _GtkAppChooserButton {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
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
            Constants$root.C_POINTER$LAYOUT.withName("priv")
        ).withName("parent"),
        Constants$root.C_POINTER$LAYOUT.withName("priv")
    ).withName("_GtkAppChooserButton");
    public static MemoryLayout $LAYOUT() {
        return _GtkAppChooserButton.$struct$LAYOUT;
    }
    public static MemorySegment parent$slice(MemorySegment seg) {
        return seg.asSlice(0, 56);
    }
    static final VarHandle priv$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("priv"));
    public static VarHandle priv$VH() {
        return _GtkAppChooserButton.priv$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GtkAppChooserButtonPrivate* priv;
     * }
     */
    public static MemorySegment priv$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkAppChooserButton.priv$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GtkAppChooserButtonPrivate* priv;
     * }
     */
    public static void priv$set(MemorySegment seg, MemorySegment x) {
        _GtkAppChooserButton.priv$VH.set(seg, x);
    }
    public static MemorySegment priv$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkAppChooserButton.priv$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void priv$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkAppChooserButton.priv$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


