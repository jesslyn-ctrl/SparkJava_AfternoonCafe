package App;

import lombok.Getter;

public class Path {
    public static class Web{
        @Getter public static final String REDIRECT = "/";
        @Getter public static final String HOME = "/Home/asD71973h8ak=w8VR/";
        @Getter public static final String MENU = "/Menu/YvUwjainjha-210=xYT/";
        @Getter public static final String MUSIC = "/Music/Ti08qunb=3WjykVbVa/";
        @Getter public static final String ABOUT = "/About/5=XyjabywqjUvkPX6=r";
        @Getter public static final String ITEM_DELETE_ALL_HOME = "/Delete-All/Home/";
        @Getter public static final String ITEM_DELETE = "/Delete/";
        @Getter public static final String ITEM_DELETE_ALL = "/Delete-All/";
    }

    public static class Template{
        public static final String REDIRECT = "/velocity/ace/redirect.vm";
        public static final String HOME = "/velocity/ace/home.vm";
        public static final String MENU = "/velocity/ace/menu.vm";
        public static final String MUSIC = "/velocity/ace/music.vm";
        public static final String ABOUT = "/velocity/ace/about.vm";
    }
}
