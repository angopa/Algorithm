package util;

/**
 * Created by Andres Gonzalez on 1/19/19
 */
public class SimpleUtil {

    public Boolean convertStringToBoolean(final String value) {
        if (value == null) return false;
        if (value.equals("y") || value.equals("yes") || value.equals("YES")) return true;
        return false;
    }

    public FileType getFileTypeByCode(final int code) {
        return FileType.match(code);
    }

    public FileType getFileTypeByName(final String name) {
        return FileType.match(name);
    }

    public enum FileType {
        JPEG(1, "jpeg"),
        TEXT(2, "txt"),
        PDF(3, "pdf");

        private final int code;
        private final String name;

        FileType(int code, String name) {
            this.code = code;
            this.name = name;
        }

        public static FileType match(int code) {
            for (FileType f: FileType.values()) {
                if (f.code == code) return f;
            }
            return null;
        }

        public static FileType match(String name) {
            for (FileType f: FileType.values()) {
                if (f.name.equals(name)) return f;
            }
            return null;
        }
    }
}
