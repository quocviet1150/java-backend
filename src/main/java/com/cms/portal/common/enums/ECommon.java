package com.cms.portal.common.enums;

public class ECommon {

    public enum ACTIVE_STATUS {
        ACTIVE(1L, "active"),
        IN_ACTIVE(0L, "in.active");

        private final Long value;
        private final String name;

        ACTIVE_STATUS(Long value, String name) {
            this.value = value;
            this.name = name;
        }

        public Long getValue() {
            return value;
        }

        public String getName() {
            return name;
        }
    }

    public enum DISPLAY_HOME {
        VISIBLE(1L),
        IN_VISIBLE(0L);

        private final Long value;

        DISPLAY_HOME(Long value) {
            this.value = value;
        }

        public Long getValue() {
            return value;
        }
    }

    public enum DISPLAY_TOP {
        VISIBLE(1L),
        IN_VISIBLE(0L);

        private final Long value;

        DISPLAY_TOP(Long value) {
            this.value = value;
        }

        public Long getValue() {
            return value;
        }
    }

    public enum LIMIT {
        HOMR_TOP_LEFT(6),
        HOMR_TOP_RIGHT(2);

        private final int value;

        LIMIT(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
