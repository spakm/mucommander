package com.mucommander.desktop;

public enum ActionType {
    AddBookmark("AddBookmark"),
    BatchRename("BatchRename"),
    BringAllToFront("BringAllToFront"),
    CalculateChecksum("CalculateChecksum"),
    ChangeDate("ChangeDate"),
    ChangeLocation("ChangeLocation"),
    ChangePermissions("ChangePermissions"),
    CheckForUpdates("CheckForUpdates"),
    CloneTabToOtherPanel("CloneTabToOtherPanel"),
    CloseDuplicateTabs("CloseDuplicateTabs"),
    CloseOtherTabs("CloseOtherTabs"),
    CloseTab("CloseTab"),
    CloseWindow("CloseWindow"),
    CombineFiles("CombineFiles"),
    CompareFolders("CompareFolders"),
    ConnectToServer("ConnectToServer"),
    Copy("Copy"),
    CopyFileBaseNames("CopyFileBaseNames"),
    CopyFileNames("CopyFileNames"),
    CopyFilePaths("CopyFilePaths"),
    CopyFilesToClipboard("CopyFilesToClipboard"),
    CustomizeCommandBar("CustomizeCommandBar"),
    Delete("Delete"),
    Donate("Donate"),
    DuplicateTab("DuplicateTab"),
    Edit("Edit"),
    EditBookmarks("EditBookmarks"),
    EditCredentials("EditCredentials"),
    Email("Email"),
    EmptyTrash("EmptyTrash"),
    ExploreBookmarks("ExploreBookmarks"),
    Find("Find"),
    FocusNext("FocusNext"),
    FocusPrevious("FocusPrevious"),
    GarbageCollect("GarbageCollect"),
    GoBack("GoBack"),
    GoForward("GoForward"),
    GoToDocumentation("GoToDocumentation"),
    GoToForums("GoToForums"),
    GoToHome("GoToHome"),
    GoToParent("GoToParent"),
    GoToParentInBothPanels("GoToParentInBothPanels"),
    GoToParentInOtherPanel("GoToParentInOtherPanel"),
    GoToRoot("GoToRoot"),
    GoToWebsite("GoToWebsite"),
    InternalEdit("InternalEdit"),
    InternalView("InternalView"),
    InvertSelection("InvertSelection"),
    LocalCopy("LocalCopy"),
    MarkAll("MarkAll"),
    MarkExtension("MarkExtension"),
    MarkGroup("MarkGroup"),
    MarkNextBlock("MarkNextBlock"),
    MarkNextPage("MarkNextPage"),
    MarkNextRow("MarkNextRow"),
    MarkPreviousBlock("MarkPreviousBlock"),
    MarkPreviousPage("MarkPreviousPage"),
    MarkPreviousRow("MarkPreviousRow"),
    MarkSelectedFile("MarkSelectedFile"),
    MarkToFirstRow("MarkToFirstRow"),
    MarkToLastRow("MarkToLastRow"),
    MaximizeWindow("MaximizeWindow"),
    MinimizeWindow("MinimizeWindow"),
    Mkdir("Mkdir"),
    Mkfile("Mkfile"),
    Move("Move"),
    MoveTabToOtherPanel("MoveTabToOtherPanel"),
    NewTab("NewTab"),
    NewWindow("NewWindow"),
    NextTab("NextTab"),
    Open("Open"),
    OpenAs("OpenAs"),
    OpenCommandPrompt("OpenCommandPrompt"),
    OpenInBothPanels("OpenInBothPanels"),
    OpenInNewTab("OpenInNewTab"),
    OpenInOtherPanel("OpenInOtherPanel"),
//    OpenLocation(),
    OpenNatively("OpenNatively"),
    OpenTrash("OpenTrash"),
    OpenURLInBrowser("OpenURLInBrowser"),
    Pack("Pack"),
    PasteClipboardFiles("PasteClipboardFiles"),
    PermanentDelete("PermanentDelete"),
    PopupLeftDriveButton("PopupLeftDriveButton"),
    PopupRightDriveButton("PopupRightDriveButton"),
    PreviousTab("PreviousTab"),
    QuickFind("QuickFind"),
    Quit("Quit"),
    RecallNextWindow("RecallNextWindow"),
    RecallPreviousWindow("RecallPreviousWindow"),
    RecallWindow10("RecallWindow10"),
    RecallWindow1("RecallWindow1"),
    RecallWindow2("RecallWindow2"),
    RecallWindow3("RecallWindow3"),
    RecallWindow4("RecallWindow4"),
    RecallWindow5("RecallWindow5"),
    RecallWindow6("RecallWindow6"),
    RecallWindow7("RecallWindow7"),
    RecallWindow8("RecallWindow8"),
    RecallWindow9("RecallWindow9"),
    Refresh("Refresh"),
    Rename("Rename"),
    ReportBug("ReportBug"),
    RevealInDesktop("RevealInDesktop"),
    ReverseSortOrder("ReverseSortOrder"),
    RunCommand("RunCommand"),
    SelectFirstRow("SelectFirstRow"),
    SelectLastRow("SelectLastRow"),
    SelectNextBlock("SelectNextBlock"),
    SelectNextPage("SelectNextPage"),
    SelectNextRow("SelectNextRow"),
    SelectPreviousBlock("SelectPreviousBlock"),
    SelectPreviousPage("SelectPreviousPage"),
    SelectPreviousRow("SelectPreviousRow"),
    SetSameFolder("SetSameFolder"),
    SetTabTitle("SetTabTitle"),
    ShowAbout("ShowAbout"),
    ShowBookmarksQL("ShowBookmarksQL"),
    ShowDebugConsole("ShowDebugConsole"),
    ShowFilePopupMenu("ShowFilePopupMenu"),
    ShowFileProperties("ShowFileProperties"),
    ShowInEnclosingFolder("ShowInEnclosingFolder"),
    ShowKeyboardShortcuts("ShowKeyboardShortcuts"),
    ShowParentFoldersQL("ShowParentFoldersQL"),
    ShowPreferences("ShowPreferences"),
    ShowRecentExecutedFilesQL("ShowRecentExecutedFilesQL"),
    ShowRecentLocationsQL("ShowRecentLocationsQL"),
    ShowRootFoldersQL("ShowRootFoldersQL"),
    ShowServerConnections("ShowServerConnections"),
    ShowTabsQL("ShowTabsQL"),
    SortByDate("SortByDate"),
    SortByExtension("SortByExtension"),
    SortByGroup("SortByGroup"),
    SortByName("SortByName"),
    SortByOwner("SortByOwner"),
    SortByPermissions("SortByPermissions"),
    SortBySize("SortBySize"),
    SplitEqually("SplitEqually"),
    SplitFile("SplitFile"),
    SplitHorizontally("SplitHorizontally"),
    SplitVertically("SplitVertically"),
    Stop("Stop"),
    SwapFolders("SwapFolders"),
    SwitchActiveTable("SwitchActiveTable"),
    ToggleAutoSize("ToggleAutoSize"),
    ToggleCommandBar("ToggleCommandBar"),
    ToggleDateColumn("ToggleDateColumn"),
    ToggleExtensionColumn("ToggleExtensionColumn"),
    ToggleGroupColumn("ToggleGroupColumn"),
    ToggleHiddenFiles("ToggleHiddenFiles"),
    ToggleLockTab("ToggleLockTab"),
    ToggleOwnerColumn("ToggleOwnerColumn"),
    TogglePermissionsColumn("TogglePermissionsColumn"),
    ToggleShowFoldersFirst("ToggleShowFoldersFirst"),
    ToggleSizeColumn("ToggleSizeColumn"),
    ToggleStatusBar("ToggleStatusBar"),
    ToggleToolBar("ToggleToolBar"),
    ToggleTree("ToggleTree"),
    ToggleUseSinglePanel("ToggleSinglePanel"),
    UnmarkAll("UnmarkAll"),
    UnmarkGroup("UnmarkGroup"),
    Unpack("Unpack"),
    View("View");
    

    private String id;

    ActionType(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }
}
