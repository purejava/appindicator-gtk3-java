// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _AtkAttribute {
 *     gchar* name;
 *     gchar* value;
 * };
 * }
 */
public class _AtkAttribute {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("name"),
        Constants$root.C_POINTER$LAYOUT.withName("value")
    ).withName("_AtkAttribute");
    public static MemoryLayout $LAYOUT() {
        return _AtkAttribute.$struct$LAYOUT;
    }
    static final VarHandle name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("name"));
    public static VarHandle name$VH() {
        return _AtkAttribute.name$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gchar* name;
     * }
     */
    public static MemorySegment name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_AtkAttribute.name$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gchar* name;
     * }
     */
    public static void name$set(MemorySegment seg, MemorySegment x) {
        _AtkAttribute.name$VH.set(seg, x);
    }
    public static MemorySegment name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_AtkAttribute.name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void name$set(MemorySegment seg, long index, MemorySegment x) {
        _AtkAttribute.name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle value$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("value"));
    public static VarHandle value$VH() {
        return _AtkAttribute.value$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gchar* value;
     * }
     */
    public static MemorySegment value$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_AtkAttribute.value$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gchar* value;
     * }
     */
    public static void value$set(MemorySegment seg, MemorySegment x) {
        _AtkAttribute.value$VH.set(seg, x);
    }
    public static MemorySegment value$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_AtkAttribute.value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value$set(MemorySegment seg, long index, MemorySegment x) {
        _AtkAttribute.value$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


