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
 * struct _GFileInputStreamClass {
 *     GInputStreamClass parent_class;
 *     goffset (*tell)(GFileInputStream *);
 *     gboolean (*can_seek)(GFileInputStream *);
 *     gboolean (*seek)(GFileInputStream *, goffset, GSeekType, GCancellable *, GError **);
 *     GFileInfo *(*query_info)(GFileInputStream *, const char *, GCancellable *, GError **);
 *     void (*query_info_async)(GFileInputStream *, const char *, int, GCancellable *, GAsyncReadyCallback, gpointer);
 *     GFileInfo *(*query_info_finish)(GFileInputStream *, GAsyncResult *, GError **);
 *     void (*_g_reserved1)(void);
 *     void (*_g_reserved2)(void);
 *     void (*_g_reserved3)(void);
 *     void (*_g_reserved4)(void);
 *     void (*_g_reserved5)(void);
 * }
 * }
 */
public class _GFileInputStreamClass {

    _GFileInputStreamClass() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GInputStreamClass.layout().withName("parent_class"),
        app_indicator_h.C_POINTER.withName("tell"),
        app_indicator_h.C_POINTER.withName("can_seek"),
        app_indicator_h.C_POINTER.withName("seek"),
        app_indicator_h.C_POINTER.withName("query_info"),
        app_indicator_h.C_POINTER.withName("query_info_async"),
        app_indicator_h.C_POINTER.withName("query_info_finish"),
        app_indicator_h.C_POINTER.withName("_g_reserved1"),
        app_indicator_h.C_POINTER.withName("_g_reserved2"),
        app_indicator_h.C_POINTER.withName("_g_reserved3"),
        app_indicator_h.C_POINTER.withName("_g_reserved4"),
        app_indicator_h.C_POINTER.withName("_g_reserved5")
    ).withName("_GFileInputStreamClass");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout parent_class$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("parent_class"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GInputStreamClass parent_class
     * }
     */
    public static final GroupLayout parent_class$layout() {
        return parent_class$LAYOUT;
    }

    private static final long parent_class$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GInputStreamClass parent_class
     * }
     */
    public static final long parent_class$offset() {
        return parent_class$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GInputStreamClass parent_class
     * }
     */
    public static MemorySegment parent_class(MemorySegment struct) {
        return struct.asSlice(parent_class$OFFSET, parent_class$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GInputStreamClass parent_class
     * }
     */
    public static void parent_class(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, parent_class$OFFSET, parent_class$LAYOUT.byteSize());
    }

    /**
     * {@snippet lang=c :
     * goffset (*tell)(GFileInputStream *)
     * }
     */
    public class tell {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            long apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            app_indicator_h.C_LONG,
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(tell.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(tell.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static long invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                return (long) DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout tell$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("tell"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * goffset (*tell)(GFileInputStream *)
     * }
     */
    public static final AddressLayout tell$layout() {
        return tell$LAYOUT;
    }

    private static final long tell$OFFSET = 248;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * goffset (*tell)(GFileInputStream *)
     * }
     */
    public static final long tell$offset() {
        return tell$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * goffset (*tell)(GFileInputStream *)
     * }
     */
    public static MemorySegment tell(MemorySegment struct) {
        return struct.get(tell$LAYOUT, tell$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * goffset (*tell)(GFileInputStream *)
     * }
     */
    public static void tell(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(tell$LAYOUT, tell$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * gboolean (*can_seek)(GFileInputStream *)
     * }
     */
    public class can_seek {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            app_indicator_h.C_INT,
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(can_seek.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(can_seek.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout can_seek$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("can_seek"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean (*can_seek)(GFileInputStream *)
     * }
     */
    public static final AddressLayout can_seek$layout() {
        return can_seek$LAYOUT;
    }

    private static final long can_seek$OFFSET = 256;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean (*can_seek)(GFileInputStream *)
     * }
     */
    public static final long can_seek$offset() {
        return can_seek$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean (*can_seek)(GFileInputStream *)
     * }
     */
    public static MemorySegment can_seek(MemorySegment struct) {
        return struct.get(can_seek$LAYOUT, can_seek$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean (*can_seek)(GFileInputStream *)
     * }
     */
    public static void can_seek(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(can_seek$LAYOUT, can_seek$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * gboolean (*seek)(GFileInputStream *, goffset, GSeekType, GCancellable *, GError **)
     * }
     */
    public class seek {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, long _x1, int _x2, MemorySegment _x3, MemorySegment _x4);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            app_indicator_h.C_INT,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_LONG,
            app_indicator_h.C_INT,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(seek.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(seek.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, long _x1, int _x2, MemorySegment _x3, MemorySegment _x4) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3, _x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout seek$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("seek"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean (*seek)(GFileInputStream *, goffset, GSeekType, GCancellable *, GError **)
     * }
     */
    public static final AddressLayout seek$layout() {
        return seek$LAYOUT;
    }

    private static final long seek$OFFSET = 264;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean (*seek)(GFileInputStream *, goffset, GSeekType, GCancellable *, GError **)
     * }
     */
    public static final long seek$offset() {
        return seek$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean (*seek)(GFileInputStream *, goffset, GSeekType, GCancellable *, GError **)
     * }
     */
    public static MemorySegment seek(MemorySegment struct) {
        return struct.get(seek$LAYOUT, seek$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean (*seek)(GFileInputStream *, goffset, GSeekType, GCancellable *, GError **)
     * }
     */
    public static void seek(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(seek$LAYOUT, seek$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * GFileInfo *(*query_info)(GFileInputStream *, const char *, GCancellable *, GError **)
     * }
     */
    public class query_info {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            MemorySegment apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, MemorySegment _x3);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(query_info.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(query_info.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static MemorySegment invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, MemorySegment _x3) {
            try {
                return (MemorySegment) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout query_info$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("query_info"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GFileInfo *(*query_info)(GFileInputStream *, const char *, GCancellable *, GError **)
     * }
     */
    public static final AddressLayout query_info$layout() {
        return query_info$LAYOUT;
    }

    private static final long query_info$OFFSET = 272;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GFileInfo *(*query_info)(GFileInputStream *, const char *, GCancellable *, GError **)
     * }
     */
    public static final long query_info$offset() {
        return query_info$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GFileInfo *(*query_info)(GFileInputStream *, const char *, GCancellable *, GError **)
     * }
     */
    public static MemorySegment query_info(MemorySegment struct) {
        return struct.get(query_info$LAYOUT, query_info$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GFileInfo *(*query_info)(GFileInputStream *, const char *, GCancellable *, GError **)
     * }
     */
    public static void query_info(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(query_info$LAYOUT, query_info$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*query_info_async)(GFileInputStream *, const char *, int, GCancellable *, GAsyncReadyCallback, gpointer)
     * }
     */
    public class query_info_async {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1, int _x2, MemorySegment _x3, MemorySegment _x4, MemorySegment _x5);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_INT,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(query_info_async.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(query_info_async.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, int _x2, MemorySegment _x3, MemorySegment _x4, MemorySegment _x5) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3, _x4, _x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout query_info_async$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("query_info_async"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*query_info_async)(GFileInputStream *, const char *, int, GCancellable *, GAsyncReadyCallback, gpointer)
     * }
     */
    public static final AddressLayout query_info_async$layout() {
        return query_info_async$LAYOUT;
    }

    private static final long query_info_async$OFFSET = 280;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*query_info_async)(GFileInputStream *, const char *, int, GCancellable *, GAsyncReadyCallback, gpointer)
     * }
     */
    public static final long query_info_async$offset() {
        return query_info_async$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*query_info_async)(GFileInputStream *, const char *, int, GCancellable *, GAsyncReadyCallback, gpointer)
     * }
     */
    public static MemorySegment query_info_async(MemorySegment struct) {
        return struct.get(query_info_async$LAYOUT, query_info_async$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*query_info_async)(GFileInputStream *, const char *, int, GCancellable *, GAsyncReadyCallback, gpointer)
     * }
     */
    public static void query_info_async(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(query_info_async$LAYOUT, query_info_async$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * GFileInfo *(*query_info_finish)(GFileInputStream *, GAsyncResult *, GError **)
     * }
     */
    public class query_info_finish {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            MemorySegment apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(query_info_finish.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(query_info_finish.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static MemorySegment invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2) {
            try {
                return (MemorySegment) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout query_info_finish$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("query_info_finish"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GFileInfo *(*query_info_finish)(GFileInputStream *, GAsyncResult *, GError **)
     * }
     */
    public static final AddressLayout query_info_finish$layout() {
        return query_info_finish$LAYOUT;
    }

    private static final long query_info_finish$OFFSET = 288;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GFileInfo *(*query_info_finish)(GFileInputStream *, GAsyncResult *, GError **)
     * }
     */
    public static final long query_info_finish$offset() {
        return query_info_finish$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GFileInfo *(*query_info_finish)(GFileInputStream *, GAsyncResult *, GError **)
     * }
     */
    public static MemorySegment query_info_finish(MemorySegment struct) {
        return struct.get(query_info_finish$LAYOUT, query_info_finish$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GFileInfo *(*query_info_finish)(GFileInputStream *, GAsyncResult *, GError **)
     * }
     */
    public static void query_info_finish(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(query_info_finish$LAYOUT, query_info_finish$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*_g_reserved1)(void)
     * }
     */
    public class _g_reserved1 {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply();
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid();

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(_g_reserved1.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(_g_reserved1.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr) {
            try {
                 DOWN$MH.invokeExact(funcPtr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout _g_reserved1$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_g_reserved1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*_g_reserved1)(void)
     * }
     */
    public static final AddressLayout _g_reserved1$layout() {
        return _g_reserved1$LAYOUT;
    }

    private static final long _g_reserved1$OFFSET = 296;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*_g_reserved1)(void)
     * }
     */
    public static final long _g_reserved1$offset() {
        return _g_reserved1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*_g_reserved1)(void)
     * }
     */
    public static MemorySegment _g_reserved1(MemorySegment struct) {
        return struct.get(_g_reserved1$LAYOUT, _g_reserved1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*_g_reserved1)(void)
     * }
     */
    public static void _g_reserved1(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_g_reserved1$LAYOUT, _g_reserved1$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*_g_reserved2)(void)
     * }
     */
    public class _g_reserved2 {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply();
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid();

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(_g_reserved2.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(_g_reserved2.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr) {
            try {
                 DOWN$MH.invokeExact(funcPtr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout _g_reserved2$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_g_reserved2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*_g_reserved2)(void)
     * }
     */
    public static final AddressLayout _g_reserved2$layout() {
        return _g_reserved2$LAYOUT;
    }

    private static final long _g_reserved2$OFFSET = 304;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*_g_reserved2)(void)
     * }
     */
    public static final long _g_reserved2$offset() {
        return _g_reserved2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*_g_reserved2)(void)
     * }
     */
    public static MemorySegment _g_reserved2(MemorySegment struct) {
        return struct.get(_g_reserved2$LAYOUT, _g_reserved2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*_g_reserved2)(void)
     * }
     */
    public static void _g_reserved2(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_g_reserved2$LAYOUT, _g_reserved2$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*_g_reserved3)(void)
     * }
     */
    public class _g_reserved3 {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply();
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid();

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(_g_reserved3.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(_g_reserved3.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr) {
            try {
                 DOWN$MH.invokeExact(funcPtr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout _g_reserved3$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_g_reserved3"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*_g_reserved3)(void)
     * }
     */
    public static final AddressLayout _g_reserved3$layout() {
        return _g_reserved3$LAYOUT;
    }

    private static final long _g_reserved3$OFFSET = 312;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*_g_reserved3)(void)
     * }
     */
    public static final long _g_reserved3$offset() {
        return _g_reserved3$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*_g_reserved3)(void)
     * }
     */
    public static MemorySegment _g_reserved3(MemorySegment struct) {
        return struct.get(_g_reserved3$LAYOUT, _g_reserved3$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*_g_reserved3)(void)
     * }
     */
    public static void _g_reserved3(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_g_reserved3$LAYOUT, _g_reserved3$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*_g_reserved4)(void)
     * }
     */
    public class _g_reserved4 {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply();
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid();

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(_g_reserved4.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(_g_reserved4.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr) {
            try {
                 DOWN$MH.invokeExact(funcPtr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout _g_reserved4$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_g_reserved4"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*_g_reserved4)(void)
     * }
     */
    public static final AddressLayout _g_reserved4$layout() {
        return _g_reserved4$LAYOUT;
    }

    private static final long _g_reserved4$OFFSET = 320;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*_g_reserved4)(void)
     * }
     */
    public static final long _g_reserved4$offset() {
        return _g_reserved4$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*_g_reserved4)(void)
     * }
     */
    public static MemorySegment _g_reserved4(MemorySegment struct) {
        return struct.get(_g_reserved4$LAYOUT, _g_reserved4$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*_g_reserved4)(void)
     * }
     */
    public static void _g_reserved4(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_g_reserved4$LAYOUT, _g_reserved4$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*_g_reserved5)(void)
     * }
     */
    public class _g_reserved5 {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply();
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid();

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(_g_reserved5.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(_g_reserved5.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr) {
            try {
                 DOWN$MH.invokeExact(funcPtr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout _g_reserved5$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_g_reserved5"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*_g_reserved5)(void)
     * }
     */
    public static final AddressLayout _g_reserved5$layout() {
        return _g_reserved5$LAYOUT;
    }

    private static final long _g_reserved5$OFFSET = 328;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*_g_reserved5)(void)
     * }
     */
    public static final long _g_reserved5$offset() {
        return _g_reserved5$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*_g_reserved5)(void)
     * }
     */
    public static MemorySegment _g_reserved5(MemorySegment struct) {
        return struct.get(_g_reserved5$LAYOUT, _g_reserved5$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*_g_reserved5)(void)
     * }
     */
    public static void _g_reserved5(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_g_reserved5$LAYOUT, _g_reserved5$OFFSET, fieldValue);
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

