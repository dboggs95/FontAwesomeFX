/**
 * Copyright (c) 2015 Jens Deters http://www.jensd.de
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 *
 */
package de.jensd.fx.glyphs.fontawesome;

import de.jensd.fx.glyphs.GlyphIcon;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.text.Font;

/**
 * 
 * @author Jens Deters
 */
public class FontAwesomeIcon extends GlyphIcon<FontAwesomeIconName> {

    public final static String TTF_PATH = "/de/jensd/fx/glyphs/fontawesome/fontawesome-webfont.ttf";

    private ObjectProperty<FontAwesomeIconName> icon;
    
    static {
        Font.loadFont(FontAwesomeIcon.class.getResource(TTF_PATH).toExternalForm(), 10.0);
    }

    public FontAwesomeIcon() {
        setIcon(FontAwesomeIconName.ANCHOR);
    }

    public static FontAwesomeIcon create() {
        return new FontAwesomeIcon();
    }

    
    
    public ObjectProperty<FontAwesomeIconName> iconProperty() {
        if(icon == null){
            icon = new SimpleObjectProperty<>();
        }
        return icon;
    }

    public FontAwesomeIconName getIcon() {
        return iconProperty().getValue();
    }

    
    
    public void setIcon(FontAwesomeIconName icon) {
        iconProperty().setValue(icon);
        super.setIcon(icon);
    }
    
   
    

}