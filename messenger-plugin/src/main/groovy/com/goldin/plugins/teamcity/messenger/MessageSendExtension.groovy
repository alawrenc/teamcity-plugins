package com.goldin.plugins.teamcity.messenger

import jetbrains.buildServer.web.openapi.PagePlaces
import jetbrains.buildServer.web.openapi.PlaceId
import jetbrains.buildServer.web.openapi.SimplePageExtension
import jetbrains.buildServer.web.openapi.CustomTab

/**
 * Messenger extension
 */
class MessageSendExtension extends SimplePageExtension implements CustomTab
{
    MessageSendExtension ( PagePlaces pagePlaces )
    {
        super( pagePlaces, PlaceId.MY_TOOLS_TABS, Constants.PluginName, 'messageSend.jsp' )
        register()
    }


    @Override
    String getTabId    () { this.getClass().name }

    @Override
    String getTabTitle () { "Send Message" }

    @Override
    boolean isVisible  () { true }
}
