// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GApplicationClass {
 *     struct _GObjectClass parent_class;
 *     void (*startup)(struct _GApplication*);
 *     void (*activate)(struct _GApplication*);
 *     void (*open)(struct _GApplication*,struct _GFile**,int,char*);
 *     int (*command_line)(struct _GApplication*,struct _GApplicationCommandLine*);
 *     int (*local_command_line)(struct _GApplication*,char***,int*);
 *     void (*before_emit)(struct _GApplication*,struct _GVariant*);
 *     void (*after_emit)(struct _GApplication*,struct _GVariant*);
 *     void (*add_platform_data)(struct _GApplication*,struct _GVariantBuilder*);
 *     void (*quit_mainloop)(struct _GApplication*);
 *     void (*run_mainloop)(struct _GApplication*);
 *     void (*shutdown)(struct _GApplication*);
 *     int (*dbus_register)(struct _GApplication*,struct _GDBusConnection*,char*,struct _GError**);
 *     void (*dbus_unregister)(struct _GApplication*,struct _GDBusConnection*,char*);
 *     int (*handle_local_options)(struct _GApplication*,struct _GVariantDict*);
 *     int (*name_lost)(struct _GApplication*);
 *     void* padding[7];
 * };
 * }
 */
public class _GApplicationClass {

    public static MemoryLayout $LAYOUT() {
        return constants$736.const$4;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    /**
     * {@snippet :
 * void (*startup)(struct _GApplication*);
     * }
     */
    public interface startup {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(startup fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$736.const$5, fi, constants$13.const$1, scope);
        }
        static startup ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _display) -> {
                try {
                    constants$13.const$3.invokeExact(symbol, _display);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle startup$VH() {
        return constants$737.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*startup)(struct _GApplication*);
     * }
     */
    public static MemorySegment startup$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$737.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*startup)(struct _GApplication*);
     * }
     */
    public static void startup$set(MemorySegment seg, MemorySegment x) {
        constants$737.const$0.set(seg, x);
    }
    public static MemorySegment startup$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$737.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void startup$set(MemorySegment seg, long index, MemorySegment x) {
        constants$737.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static startup startup(MemorySegment segment, Arena scope) {
        return startup.ofAddress(startup$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*activate)(struct _GApplication*);
     * }
     */
    public interface activate {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(activate fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$737.const$1, fi, constants$13.const$1, scope);
        }
        static activate ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _display) -> {
                try {
                    constants$13.const$3.invokeExact(symbol, _display);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle activate$VH() {
        return constants$737.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*activate)(struct _GApplication*);
     * }
     */
    public static MemorySegment activate$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$737.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*activate)(struct _GApplication*);
     * }
     */
    public static void activate$set(MemorySegment seg, MemorySegment x) {
        constants$737.const$2.set(seg, x);
    }
    public static MemorySegment activate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$737.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void activate$set(MemorySegment seg, long index, MemorySegment x) {
        constants$737.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static activate activate(MemorySegment segment, Arena scope) {
        return activate.ofAddress(activate$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*open)(struct _GApplication*,struct _GFile**,int,char*);
     * }
     */
    public interface open {

        void apply(java.lang.foreign.MemorySegment clipboard, java.lang.foreign.MemorySegment atoms, int n_atoms, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(open fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$737.const$3, fi, constants$464.const$4, scope);
        }
        static open ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _clipboard, java.lang.foreign.MemorySegment _atoms, int _n_atoms, java.lang.foreign.MemorySegment _data) -> {
                try {
                    constants$737.const$4.invokeExact(symbol, _clipboard, _atoms, _n_atoms, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle open$VH() {
        return constants$737.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*open)(struct _GApplication*,struct _GFile**,int,char*);
     * }
     */
    public static MemorySegment open$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$737.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*open)(struct _GApplication*,struct _GFile**,int,char*);
     * }
     */
    public static void open$set(MemorySegment seg, MemorySegment x) {
        constants$737.const$5.set(seg, x);
    }
    public static MemorySegment open$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$737.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void open$set(MemorySegment seg, long index, MemorySegment x) {
        constants$737.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static open open(MemorySegment segment, Arena scope) {
        return open.ofAddress(open$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*command_line)(struct _GApplication*,struct _GApplicationCommandLine*);
     * }
     */
    public interface command_line {

        int apply(java.lang.foreign.MemorySegment filter_info, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(command_line fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$738.const$0, fi, constants$9.const$0, scope);
        }
        static command_line ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _filter_info, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (int)constants$12.const$1.invokeExact(symbol, _filter_info, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle command_line$VH() {
        return constants$738.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*command_line)(struct _GApplication*,struct _GApplicationCommandLine*);
     * }
     */
    public static MemorySegment command_line$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$738.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*command_line)(struct _GApplication*,struct _GApplicationCommandLine*);
     * }
     */
    public static void command_line$set(MemorySegment seg, MemorySegment x) {
        constants$738.const$1.set(seg, x);
    }
    public static MemorySegment command_line$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$738.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void command_line$set(MemorySegment seg, long index, MemorySegment x) {
        constants$738.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static command_line command_line(MemorySegment segment, Arena scope) {
        return command_line.ofAddress(command_line$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*local_command_line)(struct _GApplication*,char***,int*);
     * }
     */
    public interface local_command_line {

        int apply(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(local_command_line fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$738.const$2, fi, constants$12.const$2, scope);
        }
        static local_command_line ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _a, java.lang.foreign.MemorySegment _b, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (int)constants$12.const$4.invokeExact(symbol, _a, _b, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle local_command_line$VH() {
        return constants$738.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*local_command_line)(struct _GApplication*,char***,int*);
     * }
     */
    public static MemorySegment local_command_line$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$738.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*local_command_line)(struct _GApplication*,char***,int*);
     * }
     */
    public static void local_command_line$set(MemorySegment seg, MemorySegment x) {
        constants$738.const$3.set(seg, x);
    }
    public static MemorySegment local_command_line$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$738.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void local_command_line$set(MemorySegment seg, long index, MemorySegment x) {
        constants$738.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static local_command_line local_command_line(MemorySegment segment, Arena scope) {
        return local_command_line.ofAddress(local_command_line$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*before_emit)(struct _GApplication*,struct _GVariant*);
     * }
     */
    public interface before_emit {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(before_emit fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$738.const$4, fi, constants$13.const$4, scope);
        }
        static before_emit ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
                try {
                    constants$14.const$0.invokeExact(symbol, _tag, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle before_emit$VH() {
        return constants$738.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*before_emit)(struct _GApplication*,struct _GVariant*);
     * }
     */
    public static MemorySegment before_emit$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$738.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*before_emit)(struct _GApplication*,struct _GVariant*);
     * }
     */
    public static void before_emit$set(MemorySegment seg, MemorySegment x) {
        constants$738.const$5.set(seg, x);
    }
    public static MemorySegment before_emit$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$738.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void before_emit$set(MemorySegment seg, long index, MemorySegment x) {
        constants$738.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static before_emit before_emit(MemorySegment segment, Arena scope) {
        return before_emit.ofAddress(before_emit$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*after_emit)(struct _GApplication*,struct _GVariant*);
     * }
     */
    public interface after_emit {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(after_emit fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$739.const$0, fi, constants$13.const$4, scope);
        }
        static after_emit ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
                try {
                    constants$14.const$0.invokeExact(symbol, _tag, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle after_emit$VH() {
        return constants$739.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*after_emit)(struct _GApplication*,struct _GVariant*);
     * }
     */
    public static MemorySegment after_emit$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$739.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*after_emit)(struct _GApplication*,struct _GVariant*);
     * }
     */
    public static void after_emit$set(MemorySegment seg, MemorySegment x) {
        constants$739.const$1.set(seg, x);
    }
    public static MemorySegment after_emit$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$739.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void after_emit$set(MemorySegment seg, long index, MemorySegment x) {
        constants$739.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static after_emit after_emit(MemorySegment segment, Arena scope) {
        return after_emit.ofAddress(after_emit$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*add_platform_data)(struct _GApplication*,struct _GVariantBuilder*);
     * }
     */
    public interface add_platform_data {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(add_platform_data fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$739.const$2, fi, constants$13.const$4, scope);
        }
        static add_platform_data ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
                try {
                    constants$14.const$0.invokeExact(symbol, _tag, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle add_platform_data$VH() {
        return constants$739.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*add_platform_data)(struct _GApplication*,struct _GVariantBuilder*);
     * }
     */
    public static MemorySegment add_platform_data$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$739.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*add_platform_data)(struct _GApplication*,struct _GVariantBuilder*);
     * }
     */
    public static void add_platform_data$set(MemorySegment seg, MemorySegment x) {
        constants$739.const$3.set(seg, x);
    }
    public static MemorySegment add_platform_data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$739.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void add_platform_data$set(MemorySegment seg, long index, MemorySegment x) {
        constants$739.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static add_platform_data add_platform_data(MemorySegment segment, Arena scope) {
        return add_platform_data.ofAddress(add_platform_data$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*quit_mainloop)(struct _GApplication*);
     * }
     */
    public interface quit_mainloop {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(quit_mainloop fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$739.const$4, fi, constants$13.const$1, scope);
        }
        static quit_mainloop ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _display) -> {
                try {
                    constants$13.const$3.invokeExact(symbol, _display);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle quit_mainloop$VH() {
        return constants$739.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*quit_mainloop)(struct _GApplication*);
     * }
     */
    public static MemorySegment quit_mainloop$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$739.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*quit_mainloop)(struct _GApplication*);
     * }
     */
    public static void quit_mainloop$set(MemorySegment seg, MemorySegment x) {
        constants$739.const$5.set(seg, x);
    }
    public static MemorySegment quit_mainloop$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$739.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void quit_mainloop$set(MemorySegment seg, long index, MemorySegment x) {
        constants$739.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static quit_mainloop quit_mainloop(MemorySegment segment, Arena scope) {
        return quit_mainloop.ofAddress(quit_mainloop$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*run_mainloop)(struct _GApplication*);
     * }
     */
    public interface run_mainloop {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(run_mainloop fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$740.const$0, fi, constants$13.const$1, scope);
        }
        static run_mainloop ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _display) -> {
                try {
                    constants$13.const$3.invokeExact(symbol, _display);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle run_mainloop$VH() {
        return constants$740.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*run_mainloop)(struct _GApplication*);
     * }
     */
    public static MemorySegment run_mainloop$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$740.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*run_mainloop)(struct _GApplication*);
     * }
     */
    public static void run_mainloop$set(MemorySegment seg, MemorySegment x) {
        constants$740.const$1.set(seg, x);
    }
    public static MemorySegment run_mainloop$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$740.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void run_mainloop$set(MemorySegment seg, long index, MemorySegment x) {
        constants$740.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static run_mainloop run_mainloop(MemorySegment segment, Arena scope) {
        return run_mainloop.ofAddress(run_mainloop$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*shutdown)(struct _GApplication*);
     * }
     */
    public interface shutdown {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(shutdown fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$740.const$2, fi, constants$13.const$1, scope);
        }
        static shutdown ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _display) -> {
                try {
                    constants$13.const$3.invokeExact(symbol, _display);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle shutdown$VH() {
        return constants$740.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*shutdown)(struct _GApplication*);
     * }
     */
    public static MemorySegment shutdown$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$740.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*shutdown)(struct _GApplication*);
     * }
     */
    public static void shutdown$set(MemorySegment seg, MemorySegment x) {
        constants$740.const$3.set(seg, x);
    }
    public static MemorySegment shutdown$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$740.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void shutdown$set(MemorySegment seg, long index, MemorySegment x) {
        constants$740.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static shutdown shutdown(MemorySegment segment, Arena scope) {
        return shutdown.ofAddress(shutdown$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*dbus_register)(struct _GApplication*,struct _GDBusConnection*,char*,struct _GError**);
     * }
     */
    public interface dbus_register {

        int apply(java.lang.foreign.MemorySegment completion, java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment iter, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(dbus_register fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$740.const$4, fi, constants$34.const$5, scope);
        }
        static dbus_register ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _completion, java.lang.foreign.MemorySegment _key, java.lang.foreign.MemorySegment _iter, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (int)constants$382.const$0.invokeExact(symbol, _completion, _key, _iter, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle dbus_register$VH() {
        return constants$740.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*dbus_register)(struct _GApplication*,struct _GDBusConnection*,char*,struct _GError**);
     * }
     */
    public static MemorySegment dbus_register$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$740.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*dbus_register)(struct _GApplication*,struct _GDBusConnection*,char*,struct _GError**);
     * }
     */
    public static void dbus_register$set(MemorySegment seg, MemorySegment x) {
        constants$740.const$5.set(seg, x);
    }
    public static MemorySegment dbus_register$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$740.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void dbus_register$set(MemorySegment seg, long index, MemorySegment x) {
        constants$740.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static dbus_register dbus_register(MemorySegment segment, Arena scope) {
        return dbus_register.ofAddress(dbus_register$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*dbus_unregister)(struct _GApplication*,struct _GDBusConnection*,char*);
     * }
     */
    public interface dbus_unregister {

        void apply(java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment value, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(dbus_unregister fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$741.const$0, fi, constants$14.const$3, scope);
        }
        static dbus_unregister ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _key, java.lang.foreign.MemorySegment _value, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    constants$14.const$5.invokeExact(symbol, _key, _value, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle dbus_unregister$VH() {
        return constants$741.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*dbus_unregister)(struct _GApplication*,struct _GDBusConnection*,char*);
     * }
     */
    public static MemorySegment dbus_unregister$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$741.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*dbus_unregister)(struct _GApplication*,struct _GDBusConnection*,char*);
     * }
     */
    public static void dbus_unregister$set(MemorySegment seg, MemorySegment x) {
        constants$741.const$1.set(seg, x);
    }
    public static MemorySegment dbus_unregister$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$741.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void dbus_unregister$set(MemorySegment seg, long index, MemorySegment x) {
        constants$741.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static dbus_unregister dbus_unregister(MemorySegment segment, Arena scope) {
        return dbus_unregister.ofAddress(dbus_unregister$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*handle_local_options)(struct _GApplication*,struct _GVariantDict*);
     * }
     */
    public interface handle_local_options {

        int apply(java.lang.foreign.MemorySegment filter_info, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(handle_local_options fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$741.const$2, fi, constants$9.const$0, scope);
        }
        static handle_local_options ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _filter_info, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (int)constants$12.const$1.invokeExact(symbol, _filter_info, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle handle_local_options$VH() {
        return constants$741.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*handle_local_options)(struct _GApplication*,struct _GVariantDict*);
     * }
     */
    public static MemorySegment handle_local_options$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$741.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*handle_local_options)(struct _GApplication*,struct _GVariantDict*);
     * }
     */
    public static void handle_local_options$set(MemorySegment seg, MemorySegment x) {
        constants$741.const$3.set(seg, x);
    }
    public static MemorySegment handle_local_options$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$741.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void handle_local_options$set(MemorySegment seg, long index, MemorySegment x) {
        constants$741.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static handle_local_options handle_local_options(MemorySegment segment, Arena scope) {
        return handle_local_options.ofAddress(handle_local_options$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*name_lost)(struct _GApplication*);
     * }
     */
    public interface name_lost {

        int apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(name_lost fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$741.const$4, fi, constants$10.const$5, scope);
        }
        static name_lost ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (int)constants$14.const$2.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle name_lost$VH() {
        return constants$741.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*name_lost)(struct _GApplication*);
     * }
     */
    public static MemorySegment name_lost$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$741.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*name_lost)(struct _GApplication*);
     * }
     */
    public static void name_lost$set(MemorySegment seg, MemorySegment x) {
        constants$741.const$5.set(seg, x);
    }
    public static MemorySegment name_lost$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$741.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void name_lost$set(MemorySegment seg, long index, MemorySegment x) {
        constants$741.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static name_lost name_lost(MemorySegment segment, Arena scope) {
        return name_lost.ofAddress(name_lost$get(segment), scope);
    }
    public static MemorySegment padding$slice(MemorySegment seg) {
        return seg.asSlice(256, 56);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

