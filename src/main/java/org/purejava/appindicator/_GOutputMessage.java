// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GOutputMessage {
 *     struct _GSocketAddress* address;
 *     struct _GOutputVector* vectors;
 *     unsigned int num_vectors;
 *     unsigned int bytes_sent;
 *     struct _GSocketControlMessage** control_messages;
 *     unsigned int num_control_messages;
 * };
 * }
 */
public class _GOutputMessage {

    public static MemoryLayout $LAYOUT() {
        return constants$697.const$3;
    }
    public static VarHandle address$VH() {
        return constants$697.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GSocketAddress* address;
     * }
     */
    public static MemorySegment address$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$697.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GSocketAddress* address;
     * }
     */
    public static void address$set(MemorySegment seg, MemorySegment x) {
        constants$697.const$4.set(seg, x);
    }
    public static MemorySegment address$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$697.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void address$set(MemorySegment seg, long index, MemorySegment x) {
        constants$697.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle vectors$VH() {
        return constants$697.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GOutputVector* vectors;
     * }
     */
    public static MemorySegment vectors$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$697.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GOutputVector* vectors;
     * }
     */
    public static void vectors$set(MemorySegment seg, MemorySegment x) {
        constants$697.const$5.set(seg, x);
    }
    public static MemorySegment vectors$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$697.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void vectors$set(MemorySegment seg, long index, MemorySegment x) {
        constants$697.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle num_vectors$VH() {
        return constants$698.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int num_vectors;
     * }
     */
    public static int num_vectors$get(MemorySegment seg) {
        return (int)constants$698.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int num_vectors;
     * }
     */
    public static void num_vectors$set(MemorySegment seg, int x) {
        constants$698.const$0.set(seg, x);
    }
    public static int num_vectors$get(MemorySegment seg, long index) {
        return (int)constants$698.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void num_vectors$set(MemorySegment seg, long index, int x) {
        constants$698.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bytes_sent$VH() {
        return constants$698.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int bytes_sent;
     * }
     */
    public static int bytes_sent$get(MemorySegment seg) {
        return (int)constants$698.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int bytes_sent;
     * }
     */
    public static void bytes_sent$set(MemorySegment seg, int x) {
        constants$698.const$1.set(seg, x);
    }
    public static int bytes_sent$get(MemorySegment seg, long index) {
        return (int)constants$698.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void bytes_sent$set(MemorySegment seg, long index, int x) {
        constants$698.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle control_messages$VH() {
        return constants$698.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GSocketControlMessage** control_messages;
     * }
     */
    public static MemorySegment control_messages$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$698.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GSocketControlMessage** control_messages;
     * }
     */
    public static void control_messages$set(MemorySegment seg, MemorySegment x) {
        constants$698.const$2.set(seg, x);
    }
    public static MemorySegment control_messages$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$698.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void control_messages$set(MemorySegment seg, long index, MemorySegment x) {
        constants$698.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle num_control_messages$VH() {
        return constants$698.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int num_control_messages;
     * }
     */
    public static int num_control_messages$get(MemorySegment seg) {
        return (int)constants$698.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int num_control_messages;
     * }
     */
    public static void num_control_messages$set(MemorySegment seg, int x) {
        constants$698.const$3.set(seg, x);
    }
    public static int num_control_messages$get(MemorySegment seg, long index) {
        return (int)constants$698.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void num_control_messages$set(MemorySegment seg, long index, int x) {
        constants$698.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


