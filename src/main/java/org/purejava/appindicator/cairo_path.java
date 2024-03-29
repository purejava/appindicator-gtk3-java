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
 * struct cairo_path {
 *     cairo_status_t status;
 *     cairo_path_data_t *data;
 *     int num_data;
 * }
 * }
 */
public class cairo_path {

    cairo_path() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        app_indicator_h.C_INT.withName("status"),
        MemoryLayout.paddingLayout(4),
        app_indicator_h.C_POINTER.withName("data"),
        app_indicator_h.C_INT.withName("num_data"),
        MemoryLayout.paddingLayout(4)
    ).withName("cairo_path");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt status$LAYOUT = (OfInt)$LAYOUT.select(groupElement("status"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cairo_status_t status
     * }
     */
    public static final OfInt status$layout() {
        return status$LAYOUT;
    }

    private static final long status$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cairo_status_t status
     * }
     */
    public static final long status$offset() {
        return status$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cairo_status_t status
     * }
     */
    public static int status(MemorySegment struct) {
        return struct.get(status$LAYOUT, status$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cairo_status_t status
     * }
     */
    public static void status(MemorySegment struct, int fieldValue) {
        struct.set(status$LAYOUT, status$OFFSET, fieldValue);
    }

    private static final AddressLayout data$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("data"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cairo_path_data_t *data
     * }
     */
    public static final AddressLayout data$layout() {
        return data$LAYOUT;
    }

    private static final long data$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cairo_path_data_t *data
     * }
     */
    public static final long data$offset() {
        return data$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cairo_path_data_t *data
     * }
     */
    public static MemorySegment data(MemorySegment struct) {
        return struct.get(data$LAYOUT, data$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cairo_path_data_t *data
     * }
     */
    public static void data(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(data$LAYOUT, data$OFFSET, fieldValue);
    }

    private static final OfInt num_data$LAYOUT = (OfInt)$LAYOUT.select(groupElement("num_data"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int num_data
     * }
     */
    public static final OfInt num_data$layout() {
        return num_data$LAYOUT;
    }

    private static final long num_data$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int num_data
     * }
     */
    public static final long num_data$offset() {
        return num_data$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int num_data
     * }
     */
    public static int num_data(MemorySegment struct) {
        return struct.get(num_data$LAYOUT, num_data$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int num_data
     * }
     */
    public static void num_data(MemorySegment struct, int fieldValue) {
        struct.set(num_data$LAYOUT, num_data$OFFSET, fieldValue);
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

