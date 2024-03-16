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
 * struct _GParamSpecDouble {
 *     GParamSpec parent_instance;
 *     gdouble minimum;
 *     gdouble maximum;
 *     gdouble default_value;
 *     gdouble epsilon;
 * }
 * }
 */
public class _GParamSpecDouble {

    _GParamSpecDouble() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GParamSpec.layout().withName("parent_instance"),
        app_indicator_h.C_DOUBLE.withName("minimum"),
        app_indicator_h.C_DOUBLE.withName("maximum"),
        app_indicator_h.C_DOUBLE.withName("default_value"),
        app_indicator_h.C_DOUBLE.withName("epsilon")
    ).withName("_GParamSpecDouble");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout parent_instance$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("parent_instance"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GParamSpec parent_instance
     * }
     */
    public static final GroupLayout parent_instance$layout() {
        return parent_instance$LAYOUT;
    }

    private static final long parent_instance$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GParamSpec parent_instance
     * }
     */
    public static final long parent_instance$offset() {
        return parent_instance$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GParamSpec parent_instance
     * }
     */
    public static MemorySegment parent_instance(MemorySegment struct) {
        return struct.asSlice(parent_instance$OFFSET, parent_instance$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GParamSpec parent_instance
     * }
     */
    public static void parent_instance(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, parent_instance$OFFSET, parent_instance$LAYOUT.byteSize());
    }

    private static final OfDouble minimum$LAYOUT = (OfDouble)$LAYOUT.select(groupElement("minimum"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gdouble minimum
     * }
     */
    public static final OfDouble minimum$layout() {
        return minimum$LAYOUT;
    }

    private static final long minimum$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gdouble minimum
     * }
     */
    public static final long minimum$offset() {
        return minimum$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gdouble minimum
     * }
     */
    public static double minimum(MemorySegment struct) {
        return struct.get(minimum$LAYOUT, minimum$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gdouble minimum
     * }
     */
    public static void minimum(MemorySegment struct, double fieldValue) {
        struct.set(minimum$LAYOUT, minimum$OFFSET, fieldValue);
    }

    private static final OfDouble maximum$LAYOUT = (OfDouble)$LAYOUT.select(groupElement("maximum"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gdouble maximum
     * }
     */
    public static final OfDouble maximum$layout() {
        return maximum$LAYOUT;
    }

    private static final long maximum$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gdouble maximum
     * }
     */
    public static final long maximum$offset() {
        return maximum$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gdouble maximum
     * }
     */
    public static double maximum(MemorySegment struct) {
        return struct.get(maximum$LAYOUT, maximum$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gdouble maximum
     * }
     */
    public static void maximum(MemorySegment struct, double fieldValue) {
        struct.set(maximum$LAYOUT, maximum$OFFSET, fieldValue);
    }

    private static final OfDouble default_value$LAYOUT = (OfDouble)$LAYOUT.select(groupElement("default_value"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gdouble default_value
     * }
     */
    public static final OfDouble default_value$layout() {
        return default_value$LAYOUT;
    }

    private static final long default_value$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gdouble default_value
     * }
     */
    public static final long default_value$offset() {
        return default_value$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gdouble default_value
     * }
     */
    public static double default_value(MemorySegment struct) {
        return struct.get(default_value$LAYOUT, default_value$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gdouble default_value
     * }
     */
    public static void default_value(MemorySegment struct, double fieldValue) {
        struct.set(default_value$LAYOUT, default_value$OFFSET, fieldValue);
    }

    private static final OfDouble epsilon$LAYOUT = (OfDouble)$LAYOUT.select(groupElement("epsilon"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gdouble epsilon
     * }
     */
    public static final OfDouble epsilon$layout() {
        return epsilon$LAYOUT;
    }

    private static final long epsilon$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gdouble epsilon
     * }
     */
    public static final long epsilon$offset() {
        return epsilon$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gdouble epsilon
     * }
     */
    public static double epsilon(MemorySegment struct) {
        return struct.get(epsilon$LAYOUT, epsilon$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gdouble epsilon
     * }
     */
    public static void epsilon(MemorySegment struct, double fieldValue) {
        struct.set(epsilon$LAYOUT, epsilon$OFFSET, fieldValue);
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

