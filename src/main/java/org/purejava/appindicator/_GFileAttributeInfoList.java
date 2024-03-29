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
 * struct _GFileAttributeInfoList {
 *     GFileAttributeInfo *infos;
 *     int n_infos;
 * }
 * }
 */
public class _GFileAttributeInfoList {

    _GFileAttributeInfoList() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        app_indicator_h.C_POINTER.withName("infos"),
        app_indicator_h.C_INT.withName("n_infos"),
        MemoryLayout.paddingLayout(4)
    ).withName("_GFileAttributeInfoList");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout infos$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("infos"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GFileAttributeInfo *infos
     * }
     */
    public static final AddressLayout infos$layout() {
        return infos$LAYOUT;
    }

    private static final long infos$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GFileAttributeInfo *infos
     * }
     */
    public static final long infos$offset() {
        return infos$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GFileAttributeInfo *infos
     * }
     */
    public static MemorySegment infos(MemorySegment struct) {
        return struct.get(infos$LAYOUT, infos$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GFileAttributeInfo *infos
     * }
     */
    public static void infos(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(infos$LAYOUT, infos$OFFSET, fieldValue);
    }

    private static final OfInt n_infos$LAYOUT = (OfInt)$LAYOUT.select(groupElement("n_infos"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int n_infos
     * }
     */
    public static final OfInt n_infos$layout() {
        return n_infos$LAYOUT;
    }

    private static final long n_infos$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int n_infos
     * }
     */
    public static final long n_infos$offset() {
        return n_infos$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int n_infos
     * }
     */
    public static int n_infos(MemorySegment struct) {
        return struct.get(n_infos$LAYOUT, n_infos$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int n_infos
     * }
     */
    public static void n_infos(MemorySegment struct, int fieldValue) {
        struct.set(n_infos$LAYOUT, n_infos$OFFSET, fieldValue);
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

