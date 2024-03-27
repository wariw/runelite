/*
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.hunter;

import java.awt.Color;
import java.awt.image.BufferedImage;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.ui.overlay.infobox.InfoBox;
import net.runelite.client.util.ColorUtil;


@Setter
@Getter
@ToString
public class RumourInfoBox extends InfoBox
{
    private boolean completed;
    private RumourMaster source;
    private final Rumour rumour;

    public RumourInfoBox(BufferedImage image, Plugin plugin, Rumour rumour, RumourMaster master)
    {
        super(image, plugin);
        this.completed = false;
        this.rumour = rumour;
        this.source = master;
    }

    @Override
    public String getText()
    {
        return this.completed ? "C" : null;
    }

    @Override
    public Color getTextColor()
    {
        return Color.GREEN;
    }

    @Override
    public String getTooltip()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(ColorUtil.wrapWithColorTag(String.format("Hunting %s for %s.", this.rumour.getName(), this.source), Color.WHITE));

        if (this.source != null) {
            sb.append("</br>");
            sb.append(this.source.getTier().toString());
        }

        return sb.toString();
    }

}
