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
 * struct _IO_FILE {
 *     int _flags;
 *     char *_IO_read_ptr;
 *     char *_IO_read_end;
 *     char *_IO_read_base;
 *     char *_IO_write_base;
 *     char *_IO_write_ptr;
 *     char *_IO_write_end;
 *     char *_IO_buf_base;
 *     char *_IO_buf_end;
 *     char *_IO_save_base;
 *     char *_IO_backup_base;
 *     char *_IO_save_end;
 *     struct _IO_marker *_markers;
 *     struct _IO_FILE *_chain;
 *     int _fileno;
 *     int _flags2;
 *     __off_t _old_offset;
 *     unsigned short _cur_column;
 *     signed char _vtable_offset;
 *     char _shortbuf[1];
 *     _IO_lock_t *_lock;
 *     __off64_t _offset;
 *     struct _IO_codecvt *_codecvt;
 *     struct _IO_wide_data *_wide_data;
 *     struct _IO_FILE *_freeres_list;
 *     void *_freeres_buf;
 *     size_t __pad5;
 *     int _mode;
 *     char _unused2[20];
 * }
 * }
 */
public class _IO_FILE {

    _IO_FILE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        app_indicator_h.C_INT.withName("_flags"),
        MemoryLayout.paddingLayout(4),
        app_indicator_h.C_POINTER.withName("_IO_read_ptr"),
        app_indicator_h.C_POINTER.withName("_IO_read_end"),
        app_indicator_h.C_POINTER.withName("_IO_read_base"),
        app_indicator_h.C_POINTER.withName("_IO_write_base"),
        app_indicator_h.C_POINTER.withName("_IO_write_ptr"),
        app_indicator_h.C_POINTER.withName("_IO_write_end"),
        app_indicator_h.C_POINTER.withName("_IO_buf_base"),
        app_indicator_h.C_POINTER.withName("_IO_buf_end"),
        app_indicator_h.C_POINTER.withName("_IO_save_base"),
        app_indicator_h.C_POINTER.withName("_IO_backup_base"),
        app_indicator_h.C_POINTER.withName("_IO_save_end"),
        app_indicator_h.C_POINTER.withName("_markers"),
        app_indicator_h.C_POINTER.withName("_chain"),
        app_indicator_h.C_INT.withName("_fileno"),
        app_indicator_h.C_INT.withName("_flags2"),
        app_indicator_h.C_LONG.withName("_old_offset"),
        app_indicator_h.C_SHORT.withName("_cur_column"),
        app_indicator_h.C_CHAR.withName("_vtable_offset"),
        MemoryLayout.sequenceLayout(1, app_indicator_h.C_CHAR).withName("_shortbuf"),
        MemoryLayout.paddingLayout(4),
        app_indicator_h.C_POINTER.withName("_lock"),
        app_indicator_h.C_LONG.withName("_offset"),
        app_indicator_h.C_POINTER.withName("_codecvt"),
        app_indicator_h.C_POINTER.withName("_wide_data"),
        app_indicator_h.C_POINTER.withName("_freeres_list"),
        app_indicator_h.C_POINTER.withName("_freeres_buf"),
        app_indicator_h.C_LONG.withName("__pad5"),
        app_indicator_h.C_INT.withName("_mode"),
        MemoryLayout.sequenceLayout(20, app_indicator_h.C_CHAR).withName("_unused2")
    ).withName("_IO_FILE");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt _flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("_flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int _flags
     * }
     */
    public static final OfInt _flags$layout() {
        return _flags$LAYOUT;
    }

    private static final long _flags$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int _flags
     * }
     */
    public static final long _flags$offset() {
        return _flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int _flags
     * }
     */
    public static int _flags(MemorySegment struct) {
        return struct.get(_flags$LAYOUT, _flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int _flags
     * }
     */
    public static void _flags(MemorySegment struct, int fieldValue) {
        struct.set(_flags$LAYOUT, _flags$OFFSET, fieldValue);
    }

    private static final AddressLayout _IO_read_ptr$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_IO_read_ptr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char *_IO_read_ptr
     * }
     */
    public static final AddressLayout _IO_read_ptr$layout() {
        return _IO_read_ptr$LAYOUT;
    }

    private static final long _IO_read_ptr$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char *_IO_read_ptr
     * }
     */
    public static final long _IO_read_ptr$offset() {
        return _IO_read_ptr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char *_IO_read_ptr
     * }
     */
    public static MemorySegment _IO_read_ptr(MemorySegment struct) {
        return struct.get(_IO_read_ptr$LAYOUT, _IO_read_ptr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char *_IO_read_ptr
     * }
     */
    public static void _IO_read_ptr(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_IO_read_ptr$LAYOUT, _IO_read_ptr$OFFSET, fieldValue);
    }

    private static final AddressLayout _IO_read_end$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_IO_read_end"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char *_IO_read_end
     * }
     */
    public static final AddressLayout _IO_read_end$layout() {
        return _IO_read_end$LAYOUT;
    }

    private static final long _IO_read_end$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char *_IO_read_end
     * }
     */
    public static final long _IO_read_end$offset() {
        return _IO_read_end$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char *_IO_read_end
     * }
     */
    public static MemorySegment _IO_read_end(MemorySegment struct) {
        return struct.get(_IO_read_end$LAYOUT, _IO_read_end$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char *_IO_read_end
     * }
     */
    public static void _IO_read_end(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_IO_read_end$LAYOUT, _IO_read_end$OFFSET, fieldValue);
    }

    private static final AddressLayout _IO_read_base$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_IO_read_base"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char *_IO_read_base
     * }
     */
    public static final AddressLayout _IO_read_base$layout() {
        return _IO_read_base$LAYOUT;
    }

    private static final long _IO_read_base$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char *_IO_read_base
     * }
     */
    public static final long _IO_read_base$offset() {
        return _IO_read_base$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char *_IO_read_base
     * }
     */
    public static MemorySegment _IO_read_base(MemorySegment struct) {
        return struct.get(_IO_read_base$LAYOUT, _IO_read_base$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char *_IO_read_base
     * }
     */
    public static void _IO_read_base(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_IO_read_base$LAYOUT, _IO_read_base$OFFSET, fieldValue);
    }

    private static final AddressLayout _IO_write_base$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_IO_write_base"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char *_IO_write_base
     * }
     */
    public static final AddressLayout _IO_write_base$layout() {
        return _IO_write_base$LAYOUT;
    }

    private static final long _IO_write_base$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char *_IO_write_base
     * }
     */
    public static final long _IO_write_base$offset() {
        return _IO_write_base$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char *_IO_write_base
     * }
     */
    public static MemorySegment _IO_write_base(MemorySegment struct) {
        return struct.get(_IO_write_base$LAYOUT, _IO_write_base$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char *_IO_write_base
     * }
     */
    public static void _IO_write_base(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_IO_write_base$LAYOUT, _IO_write_base$OFFSET, fieldValue);
    }

    private static final AddressLayout _IO_write_ptr$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_IO_write_ptr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char *_IO_write_ptr
     * }
     */
    public static final AddressLayout _IO_write_ptr$layout() {
        return _IO_write_ptr$LAYOUT;
    }

    private static final long _IO_write_ptr$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char *_IO_write_ptr
     * }
     */
    public static final long _IO_write_ptr$offset() {
        return _IO_write_ptr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char *_IO_write_ptr
     * }
     */
    public static MemorySegment _IO_write_ptr(MemorySegment struct) {
        return struct.get(_IO_write_ptr$LAYOUT, _IO_write_ptr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char *_IO_write_ptr
     * }
     */
    public static void _IO_write_ptr(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_IO_write_ptr$LAYOUT, _IO_write_ptr$OFFSET, fieldValue);
    }

    private static final AddressLayout _IO_write_end$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_IO_write_end"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char *_IO_write_end
     * }
     */
    public static final AddressLayout _IO_write_end$layout() {
        return _IO_write_end$LAYOUT;
    }

    private static final long _IO_write_end$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char *_IO_write_end
     * }
     */
    public static final long _IO_write_end$offset() {
        return _IO_write_end$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char *_IO_write_end
     * }
     */
    public static MemorySegment _IO_write_end(MemorySegment struct) {
        return struct.get(_IO_write_end$LAYOUT, _IO_write_end$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char *_IO_write_end
     * }
     */
    public static void _IO_write_end(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_IO_write_end$LAYOUT, _IO_write_end$OFFSET, fieldValue);
    }

    private static final AddressLayout _IO_buf_base$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_IO_buf_base"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char *_IO_buf_base
     * }
     */
    public static final AddressLayout _IO_buf_base$layout() {
        return _IO_buf_base$LAYOUT;
    }

    private static final long _IO_buf_base$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char *_IO_buf_base
     * }
     */
    public static final long _IO_buf_base$offset() {
        return _IO_buf_base$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char *_IO_buf_base
     * }
     */
    public static MemorySegment _IO_buf_base(MemorySegment struct) {
        return struct.get(_IO_buf_base$LAYOUT, _IO_buf_base$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char *_IO_buf_base
     * }
     */
    public static void _IO_buf_base(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_IO_buf_base$LAYOUT, _IO_buf_base$OFFSET, fieldValue);
    }

    private static final AddressLayout _IO_buf_end$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_IO_buf_end"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char *_IO_buf_end
     * }
     */
    public static final AddressLayout _IO_buf_end$layout() {
        return _IO_buf_end$LAYOUT;
    }

    private static final long _IO_buf_end$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char *_IO_buf_end
     * }
     */
    public static final long _IO_buf_end$offset() {
        return _IO_buf_end$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char *_IO_buf_end
     * }
     */
    public static MemorySegment _IO_buf_end(MemorySegment struct) {
        return struct.get(_IO_buf_end$LAYOUT, _IO_buf_end$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char *_IO_buf_end
     * }
     */
    public static void _IO_buf_end(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_IO_buf_end$LAYOUT, _IO_buf_end$OFFSET, fieldValue);
    }

    private static final AddressLayout _IO_save_base$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_IO_save_base"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char *_IO_save_base
     * }
     */
    public static final AddressLayout _IO_save_base$layout() {
        return _IO_save_base$LAYOUT;
    }

    private static final long _IO_save_base$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char *_IO_save_base
     * }
     */
    public static final long _IO_save_base$offset() {
        return _IO_save_base$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char *_IO_save_base
     * }
     */
    public static MemorySegment _IO_save_base(MemorySegment struct) {
        return struct.get(_IO_save_base$LAYOUT, _IO_save_base$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char *_IO_save_base
     * }
     */
    public static void _IO_save_base(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_IO_save_base$LAYOUT, _IO_save_base$OFFSET, fieldValue);
    }

    private static final AddressLayout _IO_backup_base$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_IO_backup_base"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char *_IO_backup_base
     * }
     */
    public static final AddressLayout _IO_backup_base$layout() {
        return _IO_backup_base$LAYOUT;
    }

    private static final long _IO_backup_base$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char *_IO_backup_base
     * }
     */
    public static final long _IO_backup_base$offset() {
        return _IO_backup_base$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char *_IO_backup_base
     * }
     */
    public static MemorySegment _IO_backup_base(MemorySegment struct) {
        return struct.get(_IO_backup_base$LAYOUT, _IO_backup_base$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char *_IO_backup_base
     * }
     */
    public static void _IO_backup_base(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_IO_backup_base$LAYOUT, _IO_backup_base$OFFSET, fieldValue);
    }

    private static final AddressLayout _IO_save_end$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_IO_save_end"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char *_IO_save_end
     * }
     */
    public static final AddressLayout _IO_save_end$layout() {
        return _IO_save_end$LAYOUT;
    }

    private static final long _IO_save_end$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char *_IO_save_end
     * }
     */
    public static final long _IO_save_end$offset() {
        return _IO_save_end$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char *_IO_save_end
     * }
     */
    public static MemorySegment _IO_save_end(MemorySegment struct) {
        return struct.get(_IO_save_end$LAYOUT, _IO_save_end$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char *_IO_save_end
     * }
     */
    public static void _IO_save_end(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_IO_save_end$LAYOUT, _IO_save_end$OFFSET, fieldValue);
    }

    private static final AddressLayout _markers$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_markers"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct _IO_marker *_markers
     * }
     */
    public static final AddressLayout _markers$layout() {
        return _markers$LAYOUT;
    }

    private static final long _markers$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct _IO_marker *_markers
     * }
     */
    public static final long _markers$offset() {
        return _markers$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct _IO_marker *_markers
     * }
     */
    public static MemorySegment _markers(MemorySegment struct) {
        return struct.get(_markers$LAYOUT, _markers$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct _IO_marker *_markers
     * }
     */
    public static void _markers(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_markers$LAYOUT, _markers$OFFSET, fieldValue);
    }

    private static final AddressLayout _chain$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_chain"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct _IO_FILE *_chain
     * }
     */
    public static final AddressLayout _chain$layout() {
        return _chain$LAYOUT;
    }

    private static final long _chain$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct _IO_FILE *_chain
     * }
     */
    public static final long _chain$offset() {
        return _chain$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct _IO_FILE *_chain
     * }
     */
    public static MemorySegment _chain(MemorySegment struct) {
        return struct.get(_chain$LAYOUT, _chain$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct _IO_FILE *_chain
     * }
     */
    public static void _chain(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_chain$LAYOUT, _chain$OFFSET, fieldValue);
    }

    private static final OfInt _fileno$LAYOUT = (OfInt)$LAYOUT.select(groupElement("_fileno"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int _fileno
     * }
     */
    public static final OfInt _fileno$layout() {
        return _fileno$LAYOUT;
    }

    private static final long _fileno$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int _fileno
     * }
     */
    public static final long _fileno$offset() {
        return _fileno$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int _fileno
     * }
     */
    public static int _fileno(MemorySegment struct) {
        return struct.get(_fileno$LAYOUT, _fileno$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int _fileno
     * }
     */
    public static void _fileno(MemorySegment struct, int fieldValue) {
        struct.set(_fileno$LAYOUT, _fileno$OFFSET, fieldValue);
    }

    private static final OfInt _flags2$LAYOUT = (OfInt)$LAYOUT.select(groupElement("_flags2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int _flags2
     * }
     */
    public static final OfInt _flags2$layout() {
        return _flags2$LAYOUT;
    }

    private static final long _flags2$OFFSET = 116;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int _flags2
     * }
     */
    public static final long _flags2$offset() {
        return _flags2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int _flags2
     * }
     */
    public static int _flags2(MemorySegment struct) {
        return struct.get(_flags2$LAYOUT, _flags2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int _flags2
     * }
     */
    public static void _flags2(MemorySegment struct, int fieldValue) {
        struct.set(_flags2$LAYOUT, _flags2$OFFSET, fieldValue);
    }

    private static final OfLong _old_offset$LAYOUT = (OfLong)$LAYOUT.select(groupElement("_old_offset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __off_t _old_offset
     * }
     */
    public static final OfLong _old_offset$layout() {
        return _old_offset$LAYOUT;
    }

    private static final long _old_offset$OFFSET = 120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __off_t _old_offset
     * }
     */
    public static final long _old_offset$offset() {
        return _old_offset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __off_t _old_offset
     * }
     */
    public static long _old_offset(MemorySegment struct) {
        return struct.get(_old_offset$LAYOUT, _old_offset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __off_t _old_offset
     * }
     */
    public static void _old_offset(MemorySegment struct, long fieldValue) {
        struct.set(_old_offset$LAYOUT, _old_offset$OFFSET, fieldValue);
    }

    private static final OfShort _cur_column$LAYOUT = (OfShort)$LAYOUT.select(groupElement("_cur_column"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned short _cur_column
     * }
     */
    public static final OfShort _cur_column$layout() {
        return _cur_column$LAYOUT;
    }

    private static final long _cur_column$OFFSET = 128;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned short _cur_column
     * }
     */
    public static final long _cur_column$offset() {
        return _cur_column$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned short _cur_column
     * }
     */
    public static short _cur_column(MemorySegment struct) {
        return struct.get(_cur_column$LAYOUT, _cur_column$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned short _cur_column
     * }
     */
    public static void _cur_column(MemorySegment struct, short fieldValue) {
        struct.set(_cur_column$LAYOUT, _cur_column$OFFSET, fieldValue);
    }

    private static final OfByte _vtable_offset$LAYOUT = (OfByte)$LAYOUT.select(groupElement("_vtable_offset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * signed char _vtable_offset
     * }
     */
    public static final OfByte _vtable_offset$layout() {
        return _vtable_offset$LAYOUT;
    }

    private static final long _vtable_offset$OFFSET = 130;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * signed char _vtable_offset
     * }
     */
    public static final long _vtable_offset$offset() {
        return _vtable_offset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * signed char _vtable_offset
     * }
     */
    public static byte _vtable_offset(MemorySegment struct) {
        return struct.get(_vtable_offset$LAYOUT, _vtable_offset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * signed char _vtable_offset
     * }
     */
    public static void _vtable_offset(MemorySegment struct, byte fieldValue) {
        struct.set(_vtable_offset$LAYOUT, _vtable_offset$OFFSET, fieldValue);
    }

    private static final SequenceLayout _shortbuf$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("_shortbuf"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char _shortbuf[1]
     * }
     */
    public static final SequenceLayout _shortbuf$layout() {
        return _shortbuf$LAYOUT;
    }

    private static final long _shortbuf$OFFSET = 131;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char _shortbuf[1]
     * }
     */
    public static final long _shortbuf$offset() {
        return _shortbuf$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char _shortbuf[1]
     * }
     */
    public static MemorySegment _shortbuf(MemorySegment struct) {
        return struct.asSlice(_shortbuf$OFFSET, _shortbuf$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char _shortbuf[1]
     * }
     */
    public static void _shortbuf(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, _shortbuf$OFFSET, _shortbuf$LAYOUT.byteSize());
    }

    private static long[] _shortbuf$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * char _shortbuf[1]
     * }
     */
    public static long[] _shortbuf$dimensions() {
        return _shortbuf$DIMS;
    }
    private static final VarHandle _shortbuf$ELEM_HANDLE = _shortbuf$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * char _shortbuf[1]
     * }
     */
    public static byte _shortbuf(MemorySegment struct, long index0) {
        return (byte)_shortbuf$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * char _shortbuf[1]
     * }
     */
    public static void _shortbuf(MemorySegment struct, long index0, byte fieldValue) {
        _shortbuf$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final AddressLayout _lock$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_lock"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * _IO_lock_t *_lock
     * }
     */
    public static final AddressLayout _lock$layout() {
        return _lock$LAYOUT;
    }

    private static final long _lock$OFFSET = 136;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * _IO_lock_t *_lock
     * }
     */
    public static final long _lock$offset() {
        return _lock$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * _IO_lock_t *_lock
     * }
     */
    public static MemorySegment _lock(MemorySegment struct) {
        return struct.get(_lock$LAYOUT, _lock$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * _IO_lock_t *_lock
     * }
     */
    public static void _lock(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_lock$LAYOUT, _lock$OFFSET, fieldValue);
    }

    private static final OfLong _offset$LAYOUT = (OfLong)$LAYOUT.select(groupElement("_offset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __off64_t _offset
     * }
     */
    public static final OfLong _offset$layout() {
        return _offset$LAYOUT;
    }

    private static final long _offset$OFFSET = 144;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __off64_t _offset
     * }
     */
    public static final long _offset$offset() {
        return _offset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __off64_t _offset
     * }
     */
    public static long _offset(MemorySegment struct) {
        return struct.get(_offset$LAYOUT, _offset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __off64_t _offset
     * }
     */
    public static void _offset(MemorySegment struct, long fieldValue) {
        struct.set(_offset$LAYOUT, _offset$OFFSET, fieldValue);
    }

    private static final AddressLayout _codecvt$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_codecvt"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct _IO_codecvt *_codecvt
     * }
     */
    public static final AddressLayout _codecvt$layout() {
        return _codecvt$LAYOUT;
    }

    private static final long _codecvt$OFFSET = 152;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct _IO_codecvt *_codecvt
     * }
     */
    public static final long _codecvt$offset() {
        return _codecvt$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct _IO_codecvt *_codecvt
     * }
     */
    public static MemorySegment _codecvt(MemorySegment struct) {
        return struct.get(_codecvt$LAYOUT, _codecvt$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct _IO_codecvt *_codecvt
     * }
     */
    public static void _codecvt(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_codecvt$LAYOUT, _codecvt$OFFSET, fieldValue);
    }

    private static final AddressLayout _wide_data$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_wide_data"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct _IO_wide_data *_wide_data
     * }
     */
    public static final AddressLayout _wide_data$layout() {
        return _wide_data$LAYOUT;
    }

    private static final long _wide_data$OFFSET = 160;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct _IO_wide_data *_wide_data
     * }
     */
    public static final long _wide_data$offset() {
        return _wide_data$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct _IO_wide_data *_wide_data
     * }
     */
    public static MemorySegment _wide_data(MemorySegment struct) {
        return struct.get(_wide_data$LAYOUT, _wide_data$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct _IO_wide_data *_wide_data
     * }
     */
    public static void _wide_data(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_wide_data$LAYOUT, _wide_data$OFFSET, fieldValue);
    }

    private static final AddressLayout _freeres_list$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_freeres_list"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct _IO_FILE *_freeres_list
     * }
     */
    public static final AddressLayout _freeres_list$layout() {
        return _freeres_list$LAYOUT;
    }

    private static final long _freeres_list$OFFSET = 168;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct _IO_FILE *_freeres_list
     * }
     */
    public static final long _freeres_list$offset() {
        return _freeres_list$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct _IO_FILE *_freeres_list
     * }
     */
    public static MemorySegment _freeres_list(MemorySegment struct) {
        return struct.get(_freeres_list$LAYOUT, _freeres_list$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct _IO_FILE *_freeres_list
     * }
     */
    public static void _freeres_list(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_freeres_list$LAYOUT, _freeres_list$OFFSET, fieldValue);
    }

    private static final AddressLayout _freeres_buf$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_freeres_buf"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *_freeres_buf
     * }
     */
    public static final AddressLayout _freeres_buf$layout() {
        return _freeres_buf$LAYOUT;
    }

    private static final long _freeres_buf$OFFSET = 176;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *_freeres_buf
     * }
     */
    public static final long _freeres_buf$offset() {
        return _freeres_buf$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *_freeres_buf
     * }
     */
    public static MemorySegment _freeres_buf(MemorySegment struct) {
        return struct.get(_freeres_buf$LAYOUT, _freeres_buf$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *_freeres_buf
     * }
     */
    public static void _freeres_buf(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_freeres_buf$LAYOUT, _freeres_buf$OFFSET, fieldValue);
    }

    private static final OfLong __pad5$LAYOUT = (OfLong)$LAYOUT.select(groupElement("__pad5"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * size_t __pad5
     * }
     */
    public static final OfLong __pad5$layout() {
        return __pad5$LAYOUT;
    }

    private static final long __pad5$OFFSET = 184;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * size_t __pad5
     * }
     */
    public static final long __pad5$offset() {
        return __pad5$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * size_t __pad5
     * }
     */
    public static long __pad5(MemorySegment struct) {
        return struct.get(__pad5$LAYOUT, __pad5$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * size_t __pad5
     * }
     */
    public static void __pad5(MemorySegment struct, long fieldValue) {
        struct.set(__pad5$LAYOUT, __pad5$OFFSET, fieldValue);
    }

    private static final OfInt _mode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("_mode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int _mode
     * }
     */
    public static final OfInt _mode$layout() {
        return _mode$LAYOUT;
    }

    private static final long _mode$OFFSET = 192;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int _mode
     * }
     */
    public static final long _mode$offset() {
        return _mode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int _mode
     * }
     */
    public static int _mode(MemorySegment struct) {
        return struct.get(_mode$LAYOUT, _mode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int _mode
     * }
     */
    public static void _mode(MemorySegment struct, int fieldValue) {
        struct.set(_mode$LAYOUT, _mode$OFFSET, fieldValue);
    }

    private static final SequenceLayout _unused2$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("_unused2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char _unused2[20]
     * }
     */
    public static final SequenceLayout _unused2$layout() {
        return _unused2$LAYOUT;
    }

    private static final long _unused2$OFFSET = 196;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char _unused2[20]
     * }
     */
    public static final long _unused2$offset() {
        return _unused2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char _unused2[20]
     * }
     */
    public static MemorySegment _unused2(MemorySegment struct) {
        return struct.asSlice(_unused2$OFFSET, _unused2$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char _unused2[20]
     * }
     */
    public static void _unused2(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, _unused2$OFFSET, _unused2$LAYOUT.byteSize());
    }

    private static long[] _unused2$DIMS = { 20 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * char _unused2[20]
     * }
     */
    public static long[] _unused2$dimensions() {
        return _unused2$DIMS;
    }
    private static final VarHandle _unused2$ELEM_HANDLE = _unused2$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * char _unused2[20]
     * }
     */
    public static byte _unused2(MemorySegment struct, long index0) {
        return (byte)_unused2$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * char _unused2[20]
     * }
     */
    public static void _unused2(MemorySegment struct, long index0, byte fieldValue) {
        _unused2$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

