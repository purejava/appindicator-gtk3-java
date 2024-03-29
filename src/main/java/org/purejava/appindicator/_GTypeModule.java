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
 * struct _GTypeModule {
 *     GObject parent_instance;
 *     guint use_count;
 *     GSList *type_infos;
 *     GSList *interface_infos;
 *     gchar *name;
 * }
 * }
 */
public class _GTypeModule {

    _GTypeModule() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GObject.layout().withName("parent_instance"),
        app_indicator_h.C_INT.withName("use_count"),
        MemoryLayout.paddingLayout(4),
        app_indicator_h.C_POINTER.withName("type_infos"),
        app_indicator_h.C_POINTER.withName("interface_infos"),
        app_indicator_h.C_POINTER.withName("name")
    ).withName("_GTypeModule");

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
     * GObject parent_instance
     * }
     */
    public static final GroupLayout parent_instance$layout() {
        return parent_instance$LAYOUT;
    }

    private static final long parent_instance$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GObject parent_instance
     * }
     */
    public static final long parent_instance$offset() {
        return parent_instance$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GObject parent_instance
     * }
     */
    public static MemorySegment parent_instance(MemorySegment struct) {
        return struct.asSlice(parent_instance$OFFSET, parent_instance$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GObject parent_instance
     * }
     */
    public static void parent_instance(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, parent_instance$OFFSET, parent_instance$LAYOUT.byteSize());
    }

    private static final OfInt use_count$LAYOUT = (OfInt)$LAYOUT.select(groupElement("use_count"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * guint use_count
     * }
     */
    public static final OfInt use_count$layout() {
        return use_count$LAYOUT;
    }

    private static final long use_count$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * guint use_count
     * }
     */
    public static final long use_count$offset() {
        return use_count$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * guint use_count
     * }
     */
    public static int use_count(MemorySegment struct) {
        return struct.get(use_count$LAYOUT, use_count$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * guint use_count
     * }
     */
    public static void use_count(MemorySegment struct, int fieldValue) {
        struct.set(use_count$LAYOUT, use_count$OFFSET, fieldValue);
    }

    private static final AddressLayout type_infos$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("type_infos"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GSList *type_infos
     * }
     */
    public static final AddressLayout type_infos$layout() {
        return type_infos$LAYOUT;
    }

    private static final long type_infos$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GSList *type_infos
     * }
     */
    public static final long type_infos$offset() {
        return type_infos$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GSList *type_infos
     * }
     */
    public static MemorySegment type_infos(MemorySegment struct) {
        return struct.get(type_infos$LAYOUT, type_infos$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GSList *type_infos
     * }
     */
    public static void type_infos(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(type_infos$LAYOUT, type_infos$OFFSET, fieldValue);
    }

    private static final AddressLayout interface_infos$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("interface_infos"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GSList *interface_infos
     * }
     */
    public static final AddressLayout interface_infos$layout() {
        return interface_infos$LAYOUT;
    }

    private static final long interface_infos$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GSList *interface_infos
     * }
     */
    public static final long interface_infos$offset() {
        return interface_infos$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GSList *interface_infos
     * }
     */
    public static MemorySegment interface_infos(MemorySegment struct) {
        return struct.get(interface_infos$LAYOUT, interface_infos$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GSList *interface_infos
     * }
     */
    public static void interface_infos(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(interface_infos$LAYOUT, interface_infos$OFFSET, fieldValue);
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

    private static final long name$OFFSET = 48;

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

