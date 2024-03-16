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
 * struct _GDBusPropertyInfo {
 *     gint ref_count;
 *     gchar *name;
 *     gchar *signature;
 *     GDBusPropertyInfoFlags flags;
 *     GDBusAnnotationInfo **annotations;
 * }
 * }
 */
public class _GDBusPropertyInfo {

    _GDBusPropertyInfo() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        app_indicator_h.C_INT.withName("ref_count"),
        MemoryLayout.paddingLayout(4),
        app_indicator_h.C_POINTER.withName("name"),
        app_indicator_h.C_POINTER.withName("signature"),
        app_indicator_h.C_INT.withName("flags"),
        MemoryLayout.paddingLayout(4),
        app_indicator_h.C_POINTER.withName("annotations")
    ).withName("_GDBusPropertyInfo");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt ref_count$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ref_count"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gint ref_count
     * }
     */
    public static final OfInt ref_count$layout() {
        return ref_count$LAYOUT;
    }

    private static final long ref_count$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gint ref_count
     * }
     */
    public static final long ref_count$offset() {
        return ref_count$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gint ref_count
     * }
     */
    public static int ref_count(MemorySegment struct) {
        return struct.get(ref_count$LAYOUT, ref_count$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gint ref_count
     * }
     */
    public static void ref_count(MemorySegment struct, int fieldValue) {
        struct.set(ref_count$LAYOUT, ref_count$OFFSET, fieldValue);
    }

    private static final AddressLayout name$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("name"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gchar *name
     * }
     */
    public static final AddressLayout name$layout() {
        return name$LAYOUT;
    }

    private static final long name$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gchar *name
     * }
     */
    public static final long name$offset() {
        return name$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gchar *name
     * }
     */
    public static MemorySegment name(MemorySegment struct) {
        return struct.get(name$LAYOUT, name$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gchar *name
     * }
     */
    public static void name(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(name$LAYOUT, name$OFFSET, fieldValue);
    }

    private static final AddressLayout signature$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("signature"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gchar *signature
     * }
     */
    public static final AddressLayout signature$layout() {
        return signature$LAYOUT;
    }

    private static final long signature$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gchar *signature
     * }
     */
    public static final long signature$offset() {
        return signature$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gchar *signature
     * }
     */
    public static MemorySegment signature(MemorySegment struct) {
        return struct.get(signature$LAYOUT, signature$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gchar *signature
     * }
     */
    public static void signature(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(signature$LAYOUT, signature$OFFSET, fieldValue);
    }

    private static final OfInt flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GDBusPropertyInfoFlags flags
     * }
     */
    public static final OfInt flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GDBusPropertyInfoFlags flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GDBusPropertyInfoFlags flags
     * }
     */
    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GDBusPropertyInfoFlags flags
     * }
     */
    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
    }

    private static final AddressLayout annotations$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("annotations"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GDBusAnnotationInfo **annotations
     * }
     */
    public static final AddressLayout annotations$layout() {
        return annotations$LAYOUT;
    }

    private static final long annotations$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GDBusAnnotationInfo **annotations
     * }
     */
    public static final long annotations$offset() {
        return annotations$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GDBusAnnotationInfo **annotations
     * }
     */
    public static MemorySegment annotations(MemorySegment struct) {
        return struct.get(annotations$LAYOUT, annotations$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GDBusAnnotationInfo **annotations
     * }
     */
    public static void annotations(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(annotations$LAYOUT, annotations$OFFSET, fieldValue);
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

