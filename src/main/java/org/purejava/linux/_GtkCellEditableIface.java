// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GtkCellEditableIface {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("g_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("editing_done"),
        Constants$root.C_POINTER$LAYOUT.withName("remove_widget"),
        Constants$root.C_POINTER$LAYOUT.withName("start_editing")
    ).withName("_GtkCellEditableIface");
    public static MemoryLayout $LAYOUT() {
        return _GtkCellEditableIface.$struct$LAYOUT;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor editing_done$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle editing_done$MH = RuntimeHelper.downcallHandle(
        _GtkCellEditableIface.editing_done$FUNC
    );
    public interface editing_done {

        void apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(editing_done fi, MemorySession session) {
            return RuntimeHelper.upcallStub(editing_done.class, fi, _GtkCellEditableIface.editing_done$FUNC, session);
        }
        static editing_done ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    _GtkCellEditableIface.editing_done$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle editing_done$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("editing_done"));
    public static VarHandle editing_done$VH() {
        return _GtkCellEditableIface.editing_done$VH;
    }
    public static MemoryAddress editing_done$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkCellEditableIface.editing_done$VH.get(seg);
    }
    public static void editing_done$set( MemorySegment seg, MemoryAddress x) {
        _GtkCellEditableIface.editing_done$VH.set(seg, x);
    }
    public static MemoryAddress editing_done$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkCellEditableIface.editing_done$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void editing_done$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkCellEditableIface.editing_done$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static editing_done editing_done (MemorySegment segment, MemorySession session) {
        return editing_done.ofAddress(editing_done$get(segment), session);
    }
    static final FunctionDescriptor remove_widget$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle remove_widget$MH = RuntimeHelper.downcallHandle(
        _GtkCellEditableIface.remove_widget$FUNC
    );
    public interface remove_widget {

        void apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(remove_widget fi, MemorySession session) {
            return RuntimeHelper.upcallStub(remove_widget.class, fi, _GtkCellEditableIface.remove_widget$FUNC, session);
        }
        static remove_widget ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    _GtkCellEditableIface.remove_widget$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle remove_widget$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("remove_widget"));
    public static VarHandle remove_widget$VH() {
        return _GtkCellEditableIface.remove_widget$VH;
    }
    public static MemoryAddress remove_widget$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkCellEditableIface.remove_widget$VH.get(seg);
    }
    public static void remove_widget$set( MemorySegment seg, MemoryAddress x) {
        _GtkCellEditableIface.remove_widget$VH.set(seg, x);
    }
    public static MemoryAddress remove_widget$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkCellEditableIface.remove_widget$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void remove_widget$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkCellEditableIface.remove_widget$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static remove_widget remove_widget (MemorySegment segment, MemorySession session) {
        return remove_widget.ofAddress(remove_widget$get(segment), session);
    }
    static final FunctionDescriptor start_editing$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle start_editing$MH = RuntimeHelper.downcallHandle(
        _GtkCellEditableIface.start_editing$FUNC
    );
    public interface start_editing {

        void apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(start_editing fi, MemorySession session) {
            return RuntimeHelper.upcallStub(start_editing.class, fi, _GtkCellEditableIface.start_editing$FUNC, session);
        }
        static start_editing ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    _GtkCellEditableIface.start_editing$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle start_editing$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("start_editing"));
    public static VarHandle start_editing$VH() {
        return _GtkCellEditableIface.start_editing$VH;
    }
    public static MemoryAddress start_editing$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkCellEditableIface.start_editing$VH.get(seg);
    }
    public static void start_editing$set( MemorySegment seg, MemoryAddress x) {
        _GtkCellEditableIface.start_editing$VH.set(seg, x);
    }
    public static MemoryAddress start_editing$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkCellEditableIface.start_editing$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void start_editing$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkCellEditableIface.start_editing$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static start_editing start_editing (MemorySegment segment, MemorySession session) {
        return start_editing.ofAddress(start_editing$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

