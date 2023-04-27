// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _AtkRelation {
 *     GObject parent;
 *     GPtrArray* target;
 *     AtkRelationType relationship;
 * };
 * }
 */
public class _AtkRelation {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("g_class")
            ).withName("g_type_instance"),
            Constants$root.C_INT$LAYOUT.withName("ref_count"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("qdata")
        ).withName("parent"),
        Constants$root.C_POINTER$LAYOUT.withName("target"),
        Constants$root.C_INT$LAYOUT.withName("relationship"),
        MemoryLayout.paddingLayout(32)
    ).withName("_AtkRelation");
    public static MemoryLayout $LAYOUT() {
        return _AtkRelation.$struct$LAYOUT;
    }
    public static MemorySegment parent$slice(MemorySegment seg) {
        return seg.asSlice(0, 24);
    }
    static final VarHandle target$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("target"));
    public static VarHandle target$VH() {
        return _AtkRelation.target$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GPtrArray* target;
     * }
     */
    public static MemorySegment target$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_AtkRelation.target$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GPtrArray* target;
     * }
     */
    public static void target$set(MemorySegment seg, MemorySegment x) {
        _AtkRelation.target$VH.set(seg, x);
    }
    public static MemorySegment target$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_AtkRelation.target$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void target$set(MemorySegment seg, long index, MemorySegment x) {
        _AtkRelation.target$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle relationship$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("relationship"));
    public static VarHandle relationship$VH() {
        return _AtkRelation.relationship$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * AtkRelationType relationship;
     * }
     */
    public static int relationship$get(MemorySegment seg) {
        return (int)_AtkRelation.relationship$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * AtkRelationType relationship;
     * }
     */
    public static void relationship$set(MemorySegment seg, int x) {
        _AtkRelation.relationship$VH.set(seg, x);
    }
    public static int relationship$get(MemorySegment seg, long index) {
        return (int)_AtkRelation.relationship$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void relationship$set(MemorySegment seg, long index, int x) {
        _AtkRelation.relationship$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


