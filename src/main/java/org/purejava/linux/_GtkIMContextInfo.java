// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GtkIMContextInfo {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("context_id"),
        Constants$root.C_POINTER$LAYOUT.withName("context_name"),
        Constants$root.C_POINTER$LAYOUT.withName("domain"),
        Constants$root.C_POINTER$LAYOUT.withName("domain_dirname"),
        Constants$root.C_POINTER$LAYOUT.withName("default_locales")
    ).withName("_GtkIMContextInfo");
    public static MemoryLayout $LAYOUT() {
        return _GtkIMContextInfo.$struct$LAYOUT;
    }
    static final VarHandle context_id$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("context_id"));
    public static VarHandle context_id$VH() {
        return _GtkIMContextInfo.context_id$VH;
    }
    public static MemoryAddress context_id$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkIMContextInfo.context_id$VH.get(seg);
    }
    public static void context_id$set( MemorySegment seg, MemoryAddress x) {
        _GtkIMContextInfo.context_id$VH.set(seg, x);
    }
    public static MemoryAddress context_id$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkIMContextInfo.context_id$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void context_id$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkIMContextInfo.context_id$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle context_name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("context_name"));
    public static VarHandle context_name$VH() {
        return _GtkIMContextInfo.context_name$VH;
    }
    public static MemoryAddress context_name$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkIMContextInfo.context_name$VH.get(seg);
    }
    public static void context_name$set( MemorySegment seg, MemoryAddress x) {
        _GtkIMContextInfo.context_name$VH.set(seg, x);
    }
    public static MemoryAddress context_name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkIMContextInfo.context_name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void context_name$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkIMContextInfo.context_name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle domain$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("domain"));
    public static VarHandle domain$VH() {
        return _GtkIMContextInfo.domain$VH;
    }
    public static MemoryAddress domain$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkIMContextInfo.domain$VH.get(seg);
    }
    public static void domain$set( MemorySegment seg, MemoryAddress x) {
        _GtkIMContextInfo.domain$VH.set(seg, x);
    }
    public static MemoryAddress domain$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkIMContextInfo.domain$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void domain$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkIMContextInfo.domain$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle domain_dirname$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("domain_dirname"));
    public static VarHandle domain_dirname$VH() {
        return _GtkIMContextInfo.domain_dirname$VH;
    }
    public static MemoryAddress domain_dirname$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkIMContextInfo.domain_dirname$VH.get(seg);
    }
    public static void domain_dirname$set( MemorySegment seg, MemoryAddress x) {
        _GtkIMContextInfo.domain_dirname$VH.set(seg, x);
    }
    public static MemoryAddress domain_dirname$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkIMContextInfo.domain_dirname$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void domain_dirname$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkIMContextInfo.domain_dirname$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle default_locales$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("default_locales"));
    public static VarHandle default_locales$VH() {
        return _GtkIMContextInfo.default_locales$VH;
    }
    public static MemoryAddress default_locales$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkIMContextInfo.default_locales$VH.get(seg);
    }
    public static void default_locales$set( MemorySegment seg, MemoryAddress x) {
        _GtkIMContextInfo.default_locales$VH.set(seg, x);
    }
    public static MemoryAddress default_locales$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkIMContextInfo.default_locales$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void default_locales$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkIMContextInfo.default_locales$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


