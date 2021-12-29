/*
 *  This file is part of XGlow,
 *  licensed under the Apache License, Version 2.0.
 *
 *  Copyright (c) Xezard (Zotov Ivan)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package ru.xezard.glow;

import org.bukkit.plugin.java.JavaPlugin;
import ru.xezard.glow.GlowAPI;

public class GlowPlugin
extends JavaPlugin
{
    private GlowAPI glowApi;

    @Override
    public void onEnable() {
        this.glowApi = new GlowAPI(this);
    }

    @Override 
    public void onDisable() {
        this.glowApi = null;
    }
}
