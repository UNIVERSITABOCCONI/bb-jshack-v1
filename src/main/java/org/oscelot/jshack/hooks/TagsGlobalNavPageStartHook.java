/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.oscelot.jshack.hooks;

/**
 * JSHack Rendering Hook to inject JS into the top frame.
 * @author Shane Argo
 */
public class TagsGlobalNavPageStartHook extends JSHackRenderingHook {

    @Override
    public String getKey() {
        return "tags.globalNavPage.start";
    }

}
