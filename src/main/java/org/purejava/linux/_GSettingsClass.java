// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GSettingsClass {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG_LONG$LAYOUT.withName("g_type")
            ).withName("g_type_class"),
            Constants$root.C_POINTER$LAYOUT.withName("construct_properties"),
            Constants$root.C_POINTER$LAYOUT.withName("constructor"),
            Constants$root.C_POINTER$LAYOUT.withName("set_property"),
            Constants$root.C_POINTER$LAYOUT.withName("get_property"),
            Constants$root.C_POINTER$LAYOUT.withName("dispose"),
            Constants$root.C_POINTER$LAYOUT.withName("finalize"),
            Constants$root.C_POINTER$LAYOUT.withName("dispatch_properties_changed"),
            Constants$root.C_POINTER$LAYOUT.withName("notify"),
            Constants$root.C_POINTER$LAYOUT.withName("constructed"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("flags"),
            MemoryLayout.sequenceLayout(6, Constants$root.C_POINTER$LAYOUT).withName("pdummy")
        ).withName("parent_class"),
        Constants$root.C_POINTER$LAYOUT.withName("writable_changed"),
        Constants$root.C_POINTER$LAYOUT.withName("changed"),
        Constants$root.C_POINTER$LAYOUT.withName("writable_change_event"),
        Constants$root.C_POINTER$LAYOUT.withName("change_event"),
        MemoryLayout.sequenceLayout(20, Constants$root.C_POINTER$LAYOUT).withName("padding")
    ).withName("_GSettingsClass");
    public static MemoryLayout $LAYOUT() {
        return _GSettingsClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor writable_changed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle writable_changed$MH = RuntimeHelper.downcallHandle(
        _GSettingsClass.writable_changed$FUNC
    );
    public interface writable_changed {

        void apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(writable_changed fi, MemorySession session) {
            return RuntimeHelper.upcallStub(writable_changed.class, fi, _GSettingsClass.writable_changed$FUNC, session);
        }
        static writable_changed ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    _GSettingsClass.writable_changed$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle writable_changed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("writable_changed"));
    public static VarHandle writable_changed$VH() {
        return _GSettingsClass.writable_changed$VH;
    }
    public static MemoryAddress writable_changed$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSettingsClass.writable_changed$VH.get(seg);
    }
    public static void writable_changed$set( MemorySegment seg, MemoryAddress x) {
        _GSettingsClass.writable_changed$VH.set(seg, x);
    }
    public static MemoryAddress writable_changed$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSettingsClass.writable_changed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void writable_changed$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSettingsClass.writable_changed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static writable_changed writable_changed (MemorySegment segment, MemorySession session) {
        return writable_changed.ofAddress(writable_changed$get(segment), session);
    }
    static final FunctionDescriptor changed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle changed$MH = RuntimeHelper.downcallHandle(
        _GSettingsClass.changed$FUNC
    );
    public interface changed {

        void apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(changed fi, MemorySession session) {
            return RuntimeHelper.upcallStub(changed.class, fi, _GSettingsClass.changed$FUNC, session);
        }
        static changed ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    _GSettingsClass.changed$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle changed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("changed"));
    public static VarHandle changed$VH() {
        return _GSettingsClass.changed$VH;
    }
    public static MemoryAddress changed$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSettingsClass.changed$VH.get(seg);
    }
    public static void changed$set( MemorySegment seg, MemoryAddress x) {
        _GSettingsClass.changed$VH.set(seg, x);
    }
    public static MemoryAddress changed$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSettingsClass.changed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void changed$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSettingsClass.changed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static changed changed (MemorySegment segment, MemorySession session) {
        return changed.ofAddress(changed$get(segment), session);
    }
    static final FunctionDescriptor writable_change_event$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle writable_change_event$MH = RuntimeHelper.downcallHandle(
        _GSettingsClass.writable_change_event$FUNC
    );
    public interface writable_change_event {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1);
        static MemorySegment allocate(writable_change_event fi, MemorySession session) {
            return RuntimeHelper.upcallStub(writable_change_event.class, fi, _GSettingsClass.writable_change_event$FUNC, session);
        }
        static writable_change_event ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
                try {
                    return (int)_GSettingsClass.writable_change_event$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle writable_change_event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("writable_change_event"));
    public static VarHandle writable_change_event$VH() {
        return _GSettingsClass.writable_change_event$VH;
    }
    public static MemoryAddress writable_change_event$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSettingsClass.writable_change_event$VH.get(seg);
    }
    public static void writable_change_event$set( MemorySegment seg, MemoryAddress x) {
        _GSettingsClass.writable_change_event$VH.set(seg, x);
    }
    public static MemoryAddress writable_change_event$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSettingsClass.writable_change_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void writable_change_event$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSettingsClass.writable_change_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static writable_change_event writable_change_event (MemorySegment segment, MemorySession session) {
        return writable_change_event.ofAddress(writable_change_event$get(segment), session);
    }
    static final FunctionDescriptor change_event$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle change_event$MH = RuntimeHelper.downcallHandle(
        _GSettingsClass.change_event$FUNC
    );
    public interface change_event {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, int _x2);
        static MemorySegment allocate(change_event fi, MemorySession session) {
            return RuntimeHelper.upcallStub(change_event.class, fi, _GSettingsClass.change_event$FUNC, session);
        }
        static change_event ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, int __x2) -> {
                try {
                    return (int)_GSettingsClass.change_event$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle change_event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("change_event"));
    public static VarHandle change_event$VH() {
        return _GSettingsClass.change_event$VH;
    }
    public static MemoryAddress change_event$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSettingsClass.change_event$VH.get(seg);
    }
    public static void change_event$set( MemorySegment seg, MemoryAddress x) {
        _GSettingsClass.change_event$VH.set(seg, x);
    }
    public static MemoryAddress change_event$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSettingsClass.change_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void change_event$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSettingsClass.change_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static change_event change_event (MemorySegment segment, MemorySession session) {
        return change_event.ofAddress(change_event$get(segment), session);
    }
    public static MemorySegment padding$slice(MemorySegment seg) {
        return seg.asSlice(168, 160);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


