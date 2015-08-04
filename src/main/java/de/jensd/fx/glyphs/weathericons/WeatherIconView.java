/**
 * Copyright (c) 2013-2015 Jens Deters http://www.jensd.de
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 *
 */
package de.jensd.fx.glyphs.weathericons;

import de.jensd.fx.glyphs.GlyphIcon;
import javafx.scene.text.Font;

/**
 *
 * @author Jens Deters (mail@jensd.de)
 */
public class WeatherIconView extends GlyphIcon<WeatherIcon> {

    public final static String TTF_PATH = "/de/jensd/fx/glyphs/weathericons/weathericons-regular-webfont.ttf";
    public final static String FONT_FAMILY = "\'weather icons\'";

    static {
        Font.loadFont(WeatherIconView.class.getResource(TTF_PATH).toExternalForm(), 10.0);
    }

    public WeatherIconView(WeatherIcon icon) {
        setFont(new Font("weather icons", DEFAULT_ICON_SIZE));
        setIcon(icon);
    }

    public WeatherIconView() {
        this(WeatherIcon.CLOUD);
    }

    @Override
    public WeatherIcon getDefaultGlyph() {
        return WeatherIcon.CLOUD;
    }

}
