// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GtkToggleToolButton {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
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
                ).withName("parent"),
                Constants$root.C_POINTER$LAYOUT.withName("priv")
            ).withName("parent"),
            Constants$root.C_POINTER$LAYOUT.withName("priv")
        ).withName("parent"),
        Constants$root.C_POINTER$LAYOUT.withName("priv")
    ).withName("_GtkToggleToolButton");
    public static MemoryLayout $LAYOUT() {
        return _GtkToggleToolButton.$struct$LAYOUT;
    }
    public static MemorySegment parent$slice(MemorySegment seg) {
        return seg.asSlice(0, 64);
    }
    static final VarHandle priv$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("priv"));
    public static VarHandle priv$VH() {
        return _GtkToggleToolButton.priv$VH;
    }
    public static MemoryAddress priv$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkToggleToolButton.priv$VH.get(seg);
    }
    public static void priv$set( MemorySegment seg, MemoryAddress x) {
        _GtkToggleToolButton.priv$VH.set(seg, x);
    }
    public static MemoryAddress priv$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkToggleToolButton.priv$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void priv$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkToggleToolButton.priv$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


