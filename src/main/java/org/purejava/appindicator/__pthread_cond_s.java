// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct __pthread_cond_s {
 *     __atomic_wide_counter __wseq;
 *     __atomic_wide_counter __g1_start;
 *     unsigned int __g_refs[2];
 *     unsigned int __g_size[2];
 *     unsigned int __g1_orig_size;
 *     unsigned int __wrefs;
 *     unsigned int __g_signals[2];
 * }
 * }
 */
public class __pthread_cond_s {

    __pthread_cond_s() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        __atomic_wide_counter.layout().withName("__wseq"),
        __atomic_wide_counter.layout().withName("__g1_start"),
        MemoryLayout.sequenceLayout(2, app_indicator_h.C_INT).withName("__g_refs"),
        MemoryLayout.sequenceLayout(2, app_indicator_h.C_INT).withName("__g_size"),
        app_indicator_h.C_INT.withName("__g1_orig_size"),
        app_indicator_h.C_INT.withName("__wrefs"),
        MemoryLayout.sequenceLayout(2, app_indicator_h.C_INT).withName("__g_signals")
    ).withName("__pthread_cond_s");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout __wseq$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("__wseq"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __atomic_wide_counter __wseq
     * }
     */
    public static final GroupLayout __wseq$layout() {
        return __wseq$LAYOUT;
    }

    private static final long __wseq$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __atomic_wide_counter __wseq
     * }
     */
    public static final long __wseq$offset() {
        return __wseq$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __atomic_wide_counter __wseq
     * }
     */
    public static MemorySegment __wseq(MemorySegment struct) {
        return struct.asSlice(__wseq$OFFSET, __wseq$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __atomic_wide_counter __wseq
     * }
     */
    public static void __wseq(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, __wseq$OFFSET, __wseq$LAYOUT.byteSize());
    }

    private static final GroupLayout __g1_start$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("__g1_start"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __atomic_wide_counter __g1_start
     * }
     */
    public static final GroupLayout __g1_start$layout() {
        return __g1_start$LAYOUT;
    }

    private static final long __g1_start$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __atomic_wide_counter __g1_start
     * }
     */
    public static final long __g1_start$offset() {
        return __g1_start$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __atomic_wide_counter __g1_start
     * }
     */
    public static MemorySegment __g1_start(MemorySegment struct) {
        return struct.asSlice(__g1_start$OFFSET, __g1_start$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __atomic_wide_counter __g1_start
     * }
     */
    public static void __g1_start(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, __g1_start$OFFSET, __g1_start$LAYOUT.byteSize());
    }

    private static final SequenceLayout __g_refs$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("__g_refs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int __g_refs[2]
     * }
     */
    public static final SequenceLayout __g_refs$layout() {
        return __g_refs$LAYOUT;
    }

    private static final long __g_refs$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int __g_refs[2]
     * }
     */
    public static final long __g_refs$offset() {
        return __g_refs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int __g_refs[2]
     * }
     */
    public static MemorySegment __g_refs(MemorySegment struct) {
        return struct.asSlice(__g_refs$OFFSET, __g_refs$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int __g_refs[2]
     * }
     */
    public static void __g_refs(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, __g_refs$OFFSET, __g_refs$LAYOUT.byteSize());
    }

    private static long[] __g_refs$DIMS = { 2 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * unsigned int __g_refs[2]
     * }
     */
    public static long[] __g_refs$dimensions() {
        return __g_refs$DIMS;
    }
    private static final VarHandle __g_refs$ELEM_HANDLE = __g_refs$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * unsigned int __g_refs[2]
     * }
     */
    public static int __g_refs(MemorySegment struct, long index0) {
        return (int)__g_refs$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * unsigned int __g_refs[2]
     * }
     */
    public static void __g_refs(MemorySegment struct, long index0, int fieldValue) {
        __g_refs$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout __g_size$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("__g_size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int __g_size[2]
     * }
     */
    public static final SequenceLayout __g_size$layout() {
        return __g_size$LAYOUT;
    }

    private static final long __g_size$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int __g_size[2]
     * }
     */
    public static final long __g_size$offset() {
        return __g_size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int __g_size[2]
     * }
     */
    public static MemorySegment __g_size(MemorySegment struct) {
        return struct.asSlice(__g_size$OFFSET, __g_size$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int __g_size[2]
     * }
     */
    public static void __g_size(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, __g_size$OFFSET, __g_size$LAYOUT.byteSize());
    }

    private static long[] __g_size$DIMS = { 2 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * unsigned int __g_size[2]
     * }
     */
    public static long[] __g_size$dimensions() {
        return __g_size$DIMS;
    }
    private static final VarHandle __g_size$ELEM_HANDLE = __g_size$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * unsigned int __g_size[2]
     * }
     */
    public static int __g_size(MemorySegment struct, long index0) {
        return (int)__g_size$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * unsigned int __g_size[2]
     * }
     */
    public static void __g_size(MemorySegment struct, long index0, int fieldValue) {
        __g_size$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfInt __g1_orig_size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__g1_orig_size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int __g1_orig_size
     * }
     */
    public static final OfInt __g1_orig_size$layout() {
        return __g1_orig_size$LAYOUT;
    }

    private static final long __g1_orig_size$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int __g1_orig_size
     * }
     */
    public static final long __g1_orig_size$offset() {
        return __g1_orig_size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int __g1_orig_size
     * }
     */
    public static int __g1_orig_size(MemorySegment struct) {
        return struct.get(__g1_orig_size$LAYOUT, __g1_orig_size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int __g1_orig_size
     * }
     */
    public static void __g1_orig_size(MemorySegment struct, int fieldValue) {
        struct.set(__g1_orig_size$LAYOUT, __g1_orig_size$OFFSET, fieldValue);
    }

    private static final OfInt __wrefs$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__wrefs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int __wrefs
     * }
     */
    public static final OfInt __wrefs$layout() {
        return __wrefs$LAYOUT;
    }

    private static final long __wrefs$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int __wrefs
     * }
     */
    public static final long __wrefs$offset() {
        return __wrefs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int __wrefs
     * }
     */
    public static int __wrefs(MemorySegment struct) {
        return struct.get(__wrefs$LAYOUT, __wrefs$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int __wrefs
     * }
     */
    public static void __wrefs(MemorySegment struct, int fieldValue) {
        struct.set(__wrefs$LAYOUT, __wrefs$OFFSET, fieldValue);
    }

    private static final SequenceLayout __g_signals$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("__g_signals"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int __g_signals[2]
     * }
     */
    public static final SequenceLayout __g_signals$layout() {
        return __g_signals$LAYOUT;
    }

    private static final long __g_signals$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int __g_signals[2]
     * }
     */
    public static final long __g_signals$offset() {
        return __g_signals$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int __g_signals[2]
     * }
     */
    public static MemorySegment __g_signals(MemorySegment struct) {
        return struct.asSlice(__g_signals$OFFSET, __g_signals$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int __g_signals[2]
     * }
     */
    public static void __g_signals(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, __g_signals$OFFSET, __g_signals$LAYOUT.byteSize());
    }

    private static long[] __g_signals$DIMS = { 2 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * unsigned int __g_signals[2]
     * }
     */
    public static long[] __g_signals$dimensions() {
        return __g_signals$DIMS;
    }
    private static final VarHandle __g_signals$ELEM_HANDLE = __g_signals$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * unsigned int __g_signals[2]
     * }
     */
    public static int __g_signals(MemorySegment struct, long index0) {
        return (int)__g_signals$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * unsigned int __g_signals[2]
     * }
     */
    public static void __g_signals(MemorySegment struct, long index0, int fieldValue) {
        __g_signals$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

