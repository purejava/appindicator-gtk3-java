// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _AtkPlugClass {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
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
            ).withName("parent"),
            Constants$root.C_POINTER$LAYOUT.withName("get_name"),
            Constants$root.C_POINTER$LAYOUT.withName("get_description"),
            Constants$root.C_POINTER$LAYOUT.withName("get_parent"),
            Constants$root.C_POINTER$LAYOUT.withName("get_n_children"),
            Constants$root.C_POINTER$LAYOUT.withName("ref_child"),
            Constants$root.C_POINTER$LAYOUT.withName("get_index_in_parent"),
            Constants$root.C_POINTER$LAYOUT.withName("ref_relation_set"),
            Constants$root.C_POINTER$LAYOUT.withName("get_role"),
            Constants$root.C_POINTER$LAYOUT.withName("get_layer"),
            Constants$root.C_POINTER$LAYOUT.withName("get_mdi_zorder"),
            Constants$root.C_POINTER$LAYOUT.withName("ref_state_set"),
            Constants$root.C_POINTER$LAYOUT.withName("set_name"),
            Constants$root.C_POINTER$LAYOUT.withName("set_description"),
            Constants$root.C_POINTER$LAYOUT.withName("set_parent"),
            Constants$root.C_POINTER$LAYOUT.withName("set_role"),
            Constants$root.C_POINTER$LAYOUT.withName("connect_property_change_handler"),
            Constants$root.C_POINTER$LAYOUT.withName("remove_property_change_handler"),
            Constants$root.C_POINTER$LAYOUT.withName("initialize"),
            Constants$root.C_POINTER$LAYOUT.withName("children_changed"),
            Constants$root.C_POINTER$LAYOUT.withName("focus_event"),
            Constants$root.C_POINTER$LAYOUT.withName("property_change"),
            Constants$root.C_POINTER$LAYOUT.withName("state_change"),
            Constants$root.C_POINTER$LAYOUT.withName("visible_data_changed"),
            Constants$root.C_POINTER$LAYOUT.withName("active_descendant_changed"),
            Constants$root.C_POINTER$LAYOUT.withName("get_attributes"),
            Constants$root.C_POINTER$LAYOUT.withName("get_object_locale"),
            Constants$root.C_POINTER$LAYOUT.withName("pad1")
        ).withName("parent_class"),
        Constants$root.C_POINTER$LAYOUT.withName("get_object_id")
    ).withName("_AtkPlugClass");
    public static MemoryLayout $LAYOUT() {
        return _AtkPlugClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 352);
    }
    static final FunctionDescriptor get_object_id$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_object_id$MH = RuntimeHelper.downcallHandle(
        _AtkPlugClass.get_object_id$FUNC
    );
    public interface get_object_id {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(get_object_id fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_object_id.class, fi, _AtkPlugClass.get_object_id$FUNC, session);
        }
        static get_object_id ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_AtkPlugClass.get_object_id$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_object_id$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_object_id"));
    public static VarHandle get_object_id$VH() {
        return _AtkPlugClass.get_object_id$VH;
    }
    public static MemoryAddress get_object_id$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_AtkPlugClass.get_object_id$VH.get(seg);
    }
    public static void get_object_id$set( MemorySegment seg, MemoryAddress x) {
        _AtkPlugClass.get_object_id$VH.set(seg, x);
    }
    public static MemoryAddress get_object_id$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_AtkPlugClass.get_object_id$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_object_id$set(MemorySegment seg, long index, MemoryAddress x) {
        _AtkPlugClass.get_object_id$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_object_id get_object_id (MemorySegment segment, MemorySession session) {
        return get_object_id.ofAddress(get_object_id$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


