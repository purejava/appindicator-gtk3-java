// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.MemoryLayout.PathElement.sequenceElement;

/**
 * {@snippet lang=c :
 * struct {
 *     __cpu_mask __bits[16];
 * }
 * }
 */
public class cpu_set_t {

    cpu_set_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(16, app_indicator_h.C_LONG).withName("__bits")
    ).withName("$anon$39:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final SequenceLayout __bits$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("__bits"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __cpu_mask __bits[16]
     * }
     */
    public static final SequenceLayout __bits$layout() {
        return __bits$LAYOUT;
    }

    private static final long __bits$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __cpu_mask __bits[16]
     * }
     */
    public static final long __bits$offset() {
        return __bits$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __cpu_mask __bits[16]
     * }
     */
    public static MemorySegment __bits(MemorySegment struct) {
        return struct.asSlice(__bits$OFFSET, __bits$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __cpu_mask __bits[16]
     * }
     */
    public static void __bits(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, __bits$OFFSET, __bits$LAYOUT.byteSize());
    }

    private static long[] __bits$DIMS = { 16 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * __cpu_mask __bits[16]
     * }
     */
    public static long[] __bits$dimensions() {
        return __bits$DIMS;
    }
    private static final VarHandle __bits$ELEM_HANDLE = __bits$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * __cpu_mask __bits[16]
     * }
     */
    public static long __bits(MemorySegment struct, long index0) {
        return (long)__bits$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * __cpu_mask __bits[16]
     * }
     */
    public static void __bits(MemorySegment struct, long index0, long fieldValue) {
        __bits$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

