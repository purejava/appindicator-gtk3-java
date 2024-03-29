// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

/**
 * {@snippet lang=c :
 * struct _GScanner {
 *     gpointer user_data;
 *     guint max_parse_errors;
 *     guint parse_errors;
 *     const gchar *input_name;
 *     GData *qdata;
 *     GScannerConfig *config;
 *     GTokenType token;
 *     GTokenValue value;
 *     guint line;
 *     guint position;
 *     GTokenType next_token;
 *     GTokenValue next_value;
 *     guint next_line;
 *     guint next_position;
 *     GHashTable *symbol_table;
 *     gint input_fd;
 *     const gchar *text;
 *     const gchar *text_end;
 *     gchar *buffer;
 *     guint scope_id;
 *     GScannerMsgFunc msg_handler;
 * }
 * }
 */
public class _GScanner {

    _GScanner() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        app_indicator_h.C_POINTER.withName("user_data"),
        app_indicator_h.C_INT.withName("max_parse_errors"),
        app_indicator_h.C_INT.withName("parse_errors"),
        app_indicator_h.C_POINTER.withName("input_name"),
        app_indicator_h.C_POINTER.withName("qdata"),
        app_indicator_h.C_POINTER.withName("config"),
        app_indicator_h.C_INT.withName("token"),
        MemoryLayout.paddingLayout(4),
        _GTokenValue.layout().withName("value"),
        app_indicator_h.C_INT.withName("line"),
        app_indicator_h.C_INT.withName("position"),
        app_indicator_h.C_INT.withName("next_token"),
        MemoryLayout.paddingLayout(4),
        _GTokenValue.layout().withName("next_value"),
        app_indicator_h.C_INT.withName("next_line"),
        app_indicator_h.C_INT.withName("next_position"),
        app_indicator_h.C_POINTER.withName("symbol_table"),
        app_indicator_h.C_INT.withName("input_fd"),
        MemoryLayout.paddingLayout(4),
        app_indicator_h.C_POINTER.withName("text"),
        app_indicator_h.C_POINTER.withName("text_end"),
        app_indicator_h.C_POINTER.withName("buffer"),
        app_indicator_h.C_INT.withName("scope_id"),
        MemoryLayout.paddingLayout(4),
        app_indicator_h.C_POINTER.withName("msg_handler")
    ).withName("_GScanner");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout user_data$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("user_data"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gpointer user_data
     * }
     */
    public static final AddressLayout user_data$layout() {
        return user_data$LAYOUT;
    }

    private static final long user_data$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gpointer user_data
     * }
     */
    public static final long user_data$offset() {
        return user_data$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gpointer user_data
     * }
     */
    public static MemorySegment user_data(MemorySegment struct) {
        return struct.get(user_data$LAYOUT, user_data$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gpointer user_data
     * }
     */
    public static void user_data(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(user_data$LAYOUT, user_data$OFFSET, fieldValue);
    }

    private static final OfInt max_parse_errors$LAYOUT = (OfInt)$LAYOUT.select(groupElement("max_parse_errors"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * guint max_parse_errors
     * }
     */
    public static final OfInt max_parse_errors$layout() {
        return max_parse_errors$LAYOUT;
    }

    private static final long max_parse_errors$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * guint max_parse_errors
     * }
     */
    public static final long max_parse_errors$offset() {
        return max_parse_errors$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * guint max_parse_errors
     * }
     */
    public static int max_parse_errors(MemorySegment struct) {
        return struct.get(max_parse_errors$LAYOUT, max_parse_errors$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * guint max_parse_errors
     * }
     */
    public static void max_parse_errors(MemorySegment struct, int fieldValue) {
        struct.set(max_parse_errors$LAYOUT, max_parse_errors$OFFSET, fieldValue);
    }

    private static final OfInt parse_errors$LAYOUT = (OfInt)$LAYOUT.select(groupElement("parse_errors"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * guint parse_errors
     * }
     */
    public static final OfInt parse_errors$layout() {
        return parse_errors$LAYOUT;
    }

    private static final long parse_errors$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * guint parse_errors
     * }
     */
    public static final long parse_errors$offset() {
        return parse_errors$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * guint parse_errors
     * }
     */
    public static int parse_errors(MemorySegment struct) {
        return struct.get(parse_errors$LAYOUT, parse_errors$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * guint parse_errors
     * }
     */
    public static void parse_errors(MemorySegment struct, int fieldValue) {
        struct.set(parse_errors$LAYOUT, parse_errors$OFFSET, fieldValue);
    }

    private static final AddressLayout input_name$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("input_name"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const gchar *input_name
     * }
     */
    public static final AddressLayout input_name$layout() {
        return input_name$LAYOUT;
    }

    private static final long input_name$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const gchar *input_name
     * }
     */
    public static final long input_name$offset() {
        return input_name$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const gchar *input_name
     * }
     */
    public static MemorySegment input_name(MemorySegment struct) {
        return struct.get(input_name$LAYOUT, input_name$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const gchar *input_name
     * }
     */
    public static void input_name(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(input_name$LAYOUT, input_name$OFFSET, fieldValue);
    }

    private static final AddressLayout qdata$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("qdata"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GData *qdata
     * }
     */
    public static final AddressLayout qdata$layout() {
        return qdata$LAYOUT;
    }

    private static final long qdata$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GData *qdata
     * }
     */
    public static final long qdata$offset() {
        return qdata$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GData *qdata
     * }
     */
    public static MemorySegment qdata(MemorySegment struct) {
        return struct.get(qdata$LAYOUT, qdata$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GData *qdata
     * }
     */
    public static void qdata(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(qdata$LAYOUT, qdata$OFFSET, fieldValue);
    }

    private static final AddressLayout config$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("config"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GScannerConfig *config
     * }
     */
    public static final AddressLayout config$layout() {
        return config$LAYOUT;
    }

    private static final long config$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GScannerConfig *config
     * }
     */
    public static final long config$offset() {
        return config$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GScannerConfig *config
     * }
     */
    public static MemorySegment config(MemorySegment struct) {
        return struct.get(config$LAYOUT, config$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GScannerConfig *config
     * }
     */
    public static void config(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(config$LAYOUT, config$OFFSET, fieldValue);
    }

    private static final OfInt token$LAYOUT = (OfInt)$LAYOUT.select(groupElement("token"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GTokenType token
     * }
     */
    public static final OfInt token$layout() {
        return token$LAYOUT;
    }

    private static final long token$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GTokenType token
     * }
     */
    public static final long token$offset() {
        return token$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GTokenType token
     * }
     */
    public static int token(MemorySegment struct) {
        return struct.get(token$LAYOUT, token$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GTokenType token
     * }
     */
    public static void token(MemorySegment struct, int fieldValue) {
        struct.set(token$LAYOUT, token$OFFSET, fieldValue);
    }

    private static final GroupLayout value$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("value"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GTokenValue value
     * }
     */
    public static final GroupLayout value$layout() {
        return value$LAYOUT;
    }

    private static final long value$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GTokenValue value
     * }
     */
    public static final long value$offset() {
        return value$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GTokenValue value
     * }
     */
    public static MemorySegment value(MemorySegment struct) {
        return struct.asSlice(value$OFFSET, value$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GTokenValue value
     * }
     */
    public static void value(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, value$OFFSET, value$LAYOUT.byteSize());
    }

    private static final OfInt line$LAYOUT = (OfInt)$LAYOUT.select(groupElement("line"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * guint line
     * }
     */
    public static final OfInt line$layout() {
        return line$LAYOUT;
    }

    private static final long line$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * guint line
     * }
     */
    public static final long line$offset() {
        return line$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * guint line
     * }
     */
    public static int line(MemorySegment struct) {
        return struct.get(line$LAYOUT, line$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * guint line
     * }
     */
    public static void line(MemorySegment struct, int fieldValue) {
        struct.set(line$LAYOUT, line$OFFSET, fieldValue);
    }

    private static final OfInt position$LAYOUT = (OfInt)$LAYOUT.select(groupElement("position"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * guint position
     * }
     */
    public static final OfInt position$layout() {
        return position$LAYOUT;
    }

    private static final long position$OFFSET = 60;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * guint position
     * }
     */
    public static final long position$offset() {
        return position$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * guint position
     * }
     */
    public static int position(MemorySegment struct) {
        return struct.get(position$LAYOUT, position$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * guint position
     * }
     */
    public static void position(MemorySegment struct, int fieldValue) {
        struct.set(position$LAYOUT, position$OFFSET, fieldValue);
    }

    private static final OfInt next_token$LAYOUT = (OfInt)$LAYOUT.select(groupElement("next_token"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GTokenType next_token
     * }
     */
    public static final OfInt next_token$layout() {
        return next_token$LAYOUT;
    }

    private static final long next_token$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GTokenType next_token
     * }
     */
    public static final long next_token$offset() {
        return next_token$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GTokenType next_token
     * }
     */
    public static int next_token(MemorySegment struct) {
        return struct.get(next_token$LAYOUT, next_token$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GTokenType next_token
     * }
     */
    public static void next_token(MemorySegment struct, int fieldValue) {
        struct.set(next_token$LAYOUT, next_token$OFFSET, fieldValue);
    }

    private static final GroupLayout next_value$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("next_value"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GTokenValue next_value
     * }
     */
    public static final GroupLayout next_value$layout() {
        return next_value$LAYOUT;
    }

    private static final long next_value$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GTokenValue next_value
     * }
     */
    public static final long next_value$offset() {
        return next_value$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GTokenValue next_value
     * }
     */
    public static MemorySegment next_value(MemorySegment struct) {
        return struct.asSlice(next_value$OFFSET, next_value$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GTokenValue next_value
     * }
     */
    public static void next_value(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, next_value$OFFSET, next_value$LAYOUT.byteSize());
    }

    private static final OfInt next_line$LAYOUT = (OfInt)$LAYOUT.select(groupElement("next_line"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * guint next_line
     * }
     */
    public static final OfInt next_line$layout() {
        return next_line$LAYOUT;
    }

    private static final long next_line$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * guint next_line
     * }
     */
    public static final long next_line$offset() {
        return next_line$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * guint next_line
     * }
     */
    public static int next_line(MemorySegment struct) {
        return struct.get(next_line$LAYOUT, next_line$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * guint next_line
     * }
     */
    public static void next_line(MemorySegment struct, int fieldValue) {
        struct.set(next_line$LAYOUT, next_line$OFFSET, fieldValue);
    }

    private static final OfInt next_position$LAYOUT = (OfInt)$LAYOUT.select(groupElement("next_position"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * guint next_position
     * }
     */
    public static final OfInt next_position$layout() {
        return next_position$LAYOUT;
    }

    private static final long next_position$OFFSET = 84;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * guint next_position
     * }
     */
    public static final long next_position$offset() {
        return next_position$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * guint next_position
     * }
     */
    public static int next_position(MemorySegment struct) {
        return struct.get(next_position$LAYOUT, next_position$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * guint next_position
     * }
     */
    public static void next_position(MemorySegment struct, int fieldValue) {
        struct.set(next_position$LAYOUT, next_position$OFFSET, fieldValue);
    }

    private static final AddressLayout symbol_table$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("symbol_table"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GHashTable *symbol_table
     * }
     */
    public static final AddressLayout symbol_table$layout() {
        return symbol_table$LAYOUT;
    }

    private static final long symbol_table$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GHashTable *symbol_table
     * }
     */
    public static final long symbol_table$offset() {
        return symbol_table$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GHashTable *symbol_table
     * }
     */
    public static MemorySegment symbol_table(MemorySegment struct) {
        return struct.get(symbol_table$LAYOUT, symbol_table$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GHashTable *symbol_table
     * }
     */
    public static void symbol_table(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(symbol_table$LAYOUT, symbol_table$OFFSET, fieldValue);
    }

    private static final OfInt input_fd$LAYOUT = (OfInt)$LAYOUT.select(groupElement("input_fd"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gint input_fd
     * }
     */
    public static final OfInt input_fd$layout() {
        return input_fd$LAYOUT;
    }

    private static final long input_fd$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gint input_fd
     * }
     */
    public static final long input_fd$offset() {
        return input_fd$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gint input_fd
     * }
     */
    public static int input_fd(MemorySegment struct) {
        return struct.get(input_fd$LAYOUT, input_fd$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gint input_fd
     * }
     */
    public static void input_fd(MemorySegment struct, int fieldValue) {
        struct.set(input_fd$LAYOUT, input_fd$OFFSET, fieldValue);
    }

    private static final AddressLayout text$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("text"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const gchar *text
     * }
     */
    public static final AddressLayout text$layout() {
        return text$LAYOUT;
    }

    private static final long text$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const gchar *text
     * }
     */
    public static final long text$offset() {
        return text$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const gchar *text
     * }
     */
    public static MemorySegment text(MemorySegment struct) {
        return struct.get(text$LAYOUT, text$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const gchar *text
     * }
     */
    public static void text(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(text$LAYOUT, text$OFFSET, fieldValue);
    }

    private static final AddressLayout text_end$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("text_end"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const gchar *text_end
     * }
     */
    public static final AddressLayout text_end$layout() {
        return text_end$LAYOUT;
    }

    private static final long text_end$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const gchar *text_end
     * }
     */
    public static final long text_end$offset() {
        return text_end$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const gchar *text_end
     * }
     */
    public static MemorySegment text_end(MemorySegment struct) {
        return struct.get(text_end$LAYOUT, text_end$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const gchar *text_end
     * }
     */
    public static void text_end(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(text_end$LAYOUT, text_end$OFFSET, fieldValue);
    }

    private static final AddressLayout buffer$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("buffer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gchar *buffer
     * }
     */
    public static final AddressLayout buffer$layout() {
        return buffer$LAYOUT;
    }

    private static final long buffer$OFFSET = 120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gchar *buffer
     * }
     */
    public static final long buffer$offset() {
        return buffer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gchar *buffer
     * }
     */
    public static MemorySegment buffer(MemorySegment struct) {
        return struct.get(buffer$LAYOUT, buffer$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gchar *buffer
     * }
     */
    public static void buffer(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(buffer$LAYOUT, buffer$OFFSET, fieldValue);
    }

    private static final OfInt scope_id$LAYOUT = (OfInt)$LAYOUT.select(groupElement("scope_id"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * guint scope_id
     * }
     */
    public static final OfInt scope_id$layout() {
        return scope_id$LAYOUT;
    }

    private static final long scope_id$OFFSET = 128;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * guint scope_id
     * }
     */
    public static final long scope_id$offset() {
        return scope_id$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * guint scope_id
     * }
     */
    public static int scope_id(MemorySegment struct) {
        return struct.get(scope_id$LAYOUT, scope_id$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * guint scope_id
     * }
     */
    public static void scope_id(MemorySegment struct, int fieldValue) {
        struct.set(scope_id$LAYOUT, scope_id$OFFSET, fieldValue);
    }

    private static final AddressLayout msg_handler$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("msg_handler"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GScannerMsgFunc msg_handler
     * }
     */
    public static final AddressLayout msg_handler$layout() {
        return msg_handler$LAYOUT;
    }

    private static final long msg_handler$OFFSET = 136;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GScannerMsgFunc msg_handler
     * }
     */
    public static final long msg_handler$offset() {
        return msg_handler$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GScannerMsgFunc msg_handler
     * }
     */
    public static MemorySegment msg_handler(MemorySegment struct) {
        return struct.get(msg_handler$LAYOUT, msg_handler$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GScannerMsgFunc msg_handler
     * }
     */
    public static void msg_handler(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(msg_handler$LAYOUT, msg_handler$OFFSET, fieldValue);
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

