# Introduction and Goals

This document describes the Craw-Roster application, 
a plattform for the Dragons Guild Bern (DGB) to manage and organize their events.     

The Craw-Roster is a companion app to the discord server the DGB uses. 
* It provides an integration and plattform to create and manage events and the player-groups per event.
* Allows the users to manage a minimal profile that supports the even and group organization.
* Uses a custom Discord-Bot for a seamless integration in the Discord client to proved the features without the need to switch to a web GUI.    

## Requirements Overview 

The Craw-Roster integrates with Discord via a Discord-Bot and provides the following functionality with the bot and the web GUI

* Management of a guild / a Discord server - the organization specific permissions and roles that are needed for the app.
* Management of the events, the tables/groups per event.
* Synchronization between the app and the Discord Server. Events and groups per are available in the app and in Discord as event-channels where users organize the groups.
* Users don't need a dedicated account for the app, Discord is used as IDP and the application integrates via OIDC.

## Quality Goals

### Functional Suitability / Flexibility

The app should support the DGB (and possible other organizations) with managing and organizing the events.
For this the plattform needs to provide the required functionality and behavior as expected from it's users.

Interactions should be clear for the users, behavior "obvious" as the users have different levels of know-how regarding
the plattform, the organization and technology

The plattform should proved the users, admins and organizers a certain amount of flexibility 
as last minute changes are a common occurrence and the plattform should not hinder the process.

### Maintainability

The application is build and maintained by a small group of devs in their spare time.
There is a small budget in time and material so the plattform should be easy to maintain,
avoid complexity when possible and not use "obscure" technology

### Reliability

The application is build and maintained by a small group of devs in their spare time.
So the app should observer a zero to low failure rate, provide fault tolerance when discord integration is not available 
and require zero to low dev support - is best effort.

## Stakeholders

| Role                    | Description                                                          | Expectations                                                                                                                |
|-------------------------|----------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------|
| Maintainers             | Group of Devs that develop and maintain the app                      | Focus on a certain Simplicity, Maintainabilty, Relayability as the work on the app is done in their spare time.             |
| DGB Admins / Organizers | Main-Organizers, Admins that manage the DGB Discord server and group | A functional plattform that doesn't need mutch oversight, can be extendet to fit the organizations need and is easy to use. |
| Game Masters            | Organizer for a table, a group.                                      | A simple and functional way to create and manage tables per event. Easy group management and overview of the events         |
| User / Players          | New or regulars that come and play in events as part of a group.     | A simple and functional way to see the events, join/subscribe to an event and a group for an event.                         |
