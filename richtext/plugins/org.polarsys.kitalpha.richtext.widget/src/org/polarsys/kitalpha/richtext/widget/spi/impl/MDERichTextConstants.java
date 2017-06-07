/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.widget.spi.impl;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;

/**
 * 
 * @author Faycal Abka
 *
 */
public final class MDERichTextConstants {
	
	//Customization
	public static final String TOOLBAR_COLOR = "uiColor"; 			//$NON-NLS-1$
	public static final String TOOLBAR_POSITION = "toolbarPosition";//$NON-NLS-1$
	public static final String TOOLBAR_POSITION_TOP = "top";		//$NON-NLS-1$
	public static final String TOOLBAR_POSITION_BOTTOM = "bottom";	//$NON-NLS-1$
	public static final String CUSTOM_CONFIG = "customConfig"; 		//$NON-NLS-1$
	public static final String READ_ONLY_MODE = "readOnly";			//$NON-NLS-1$
	public static final String PAST_FROM_MS_WORD_PROMPT_CLEANUP = "pasteFromWordPromptCleanup";	//$NON-NLS-1$
	public static final String PAST_FROM_MS_WORD_CLEANER_FILE = "pasteFromWordCleanupFile"; //$NON-NLS-1$
	
	public static final String DEFAUTL_CUSTOM_CONFIG = getDefaultCustomConfig();
	
	public static final String ITEM_SEPARATOR = "-"; 				//$NON-NLS-1$
	
	//****************** MDE Items and toolbar ******************//
	
	public static final String MDE_LINKS_TOOLBAR = "mdelinks"; 		//$NON-NLS-1$
	public static final String MDE_ADDLINK = "Addlink"; 			//$NON-NLS-1$
	public static final String MDE_ADDIMAGE = "AddImage";			//$NON-NLS-1$
	
	public static final String MDE_ENABLE_EDITING_TOOLBAR = "enableEdit"; 	//$NON-NLS-1$
	public static final String MDE_EDITABLE = "Editable"; 			//$NON-NLS-1$
	
	public static final String MDE_CLEAN_TOOLBAR = "clean"; 		//$NON-NLS-1$
	public static final String MDE_CLEAN = "Clean"; 				//$NON-NLS-1$
	
	
	//****************** CKEditor Items and toolbar ******************//
	 //Document
	public static final String DOCUMENT_TOOLBAR = "document"; 		//$NON-NLS-1$
    public static final String SOURCE = "Source"; 					//$NON-NLS-1$
    public static final String SAVE = "Save"; 						//$NON-NLS-1$
    public static final String NEW_PAGE = "NewPage"; 				//$NON-NLS-1$
    public static final String DOC_PROPOS = "DocProps"; 			//$NON-NLS-1$
    public static final String PREVIEW = "Preview"; 				//$NON-NLS-1$
    public static final String PRINT = "Print"; 					//$NON-NLS-1$
    public static final String TEMPLATE = "Templates"; 				//$NON-NLS-1$
     

    //Clipboard
    public static final String CLIPBOARD_TOOLBAR = "clipboard"; 	//$NON-NLS-1$
    public static final String CUT = "Cut"; 						//$NON-NLS-1$
    public static final String COPY = "Copy"; 						//$NON-NLS-1$
    public static final String PASTE = "Paste"; 					//$NON-NLS-1$
    public static final String PASTE_TEXT = "PasteText"; 			//$NON-NLS-1$
    public static final String PASTE_FROM_WORD = "PasteFromWord"; 	//$NON-NLS-1$
    public static final String UNDO = "Undo"; 						//$NON-NLS-1$
    public static final String REDO = "Redo"; 						//$NON-NLS-1$

    //editing
    public static final String EDITING_TOOLBAR = "editing"; 		//$NON-NLS-1$
    public static final String FIND = "Find"; 						//$NON-NLS-1$
    public static final String REPLACE = "Replace"; 				//$NON-NLS-1$
    public static final String SELECT_ALL = "SelectAll"; 			//$NON-NLS-1$

    //Styles
    public static final String BASIC_STYLES = "basicstyles"; 		//$NON-NLS-1$
    public static final String BOLD = "Bold"; 						//$NON-NLS-1$
    public static final String ITALIC = "Italic"; 					//$NON-NLS-1$
    public static final String UNDERLINE = "Underline"; 			//$NON-NLS-1$
    public static final String STRIKE = "Strike"; 					//$NON-NLS-1$
    public static final String SUBSCRIPT = "Subscript"; 			//$NON-NLS-1$
    public static final String SUPERSCRIPT = "Superscript"; 		//$NON-NLS-1$
    public static final String REMOVE_FORMAT = "RemoveFormat"; 		//$NON-NLS-1$

    //Paragraph
    public static final String PARAGRAPH_TOOLBAR = "paragraph"; 	//$NON-NLS-1$
    public static final String NUMBERED_LIST = "NumberedList"; 		//$NON-NLS-1$
    public static final String BULLETED_LIST = "BulletedList"; 		//$NON-NLS-1$
    public static final String OUT_INDENT = "Outdent"; 				//$NON-NLS-1$
    public static final String INDENT = "Indent"; 					//$NON-NLS-1$ 
    public static final String BLOCK_QUOTE = "Blockquote"; 			//$NON-NLS-1$
    public static final String CREATE_DIV = "CreateDiv"; 			//$NON-NLS-1$
    public static final String JUSTIFY_LEFT = "JustifyLeft"; 		//$NON-NLS-1$
    public static final String JUSTIFY_CENTER = "JustifyCenter"; 	//$NON-NLS-1$
    public static final String JUSTIFY_RIGHT = "JustifyRight"; 		//$NON-NLS-1$
    public static final String JUSTIFY_BLOCK = "JustifyBlock"; 		//$NON-NLS-1$
    public static final String BIDI_LTR = "BidiLtr"; 				//$NON-NLS-1$
    public static final String BIDI_RTL = "BidiRtl"; 				//$NON-NLS-1$

    //links
    public static final String LINKS_TOOLBAR = "links"; 			//$NON-NLS-1$
    public static final String LINK = "Link"; 						//$NON-NLS-1$
    public static final String UNLINK = "Unlink"; 					//$NON-NLS-1$
    public static final String ANCHOR = "Anchor"; 					//$NON-NLS-1$

    //Insert
    public static final String INSERT_TOOLBAR = "insert"; 			//$NON-NLS-1$
    public static final String IMAGE = "Image"; 					//$NON-NLS-1$
    public static final String TABLE = "Table"; 					//$NON-NLS-1$
    public static final String HORIZONTAL_RULE = "HorizontalRule"; 	//$NON-NLS-1$
    public static final String SPECIAL_CHAR = "SpecialChar"; 		//$NON-NLS-1$
    public static final String PAGE_BREAK = "PageBreak"; 			//$NON-NLS-1$

    //Styles
    public static final String STYLES_TOOLBAR = "styles"; 			//$NON-NLS-1$
    public static final String STYLE = "style"; 					//$NON-NLS-1$
    public static final String STYLES = "Styles";					//$NON-NLS-1$
    public static final String FORMAT = "Format"; 					//$NON-NLS-1$
    public static final String FONT = "Font"; 						//$NON-NLS-1$
    public static final String FONT_SIZE = "FontSize"; 				//$NON-NLS-1$

    //Colors
    public static final String COLORS_TOOLBAR = "colors"; 			//$NON-NLS-1$
    public static final String TEXT_COLOR = "TextColor"; 			//$NON-NLS-1$
    public static final String BG_COlOR = "BGColor"; 				//$NON-NLS-1$
    
    /*
	 * cf. CKEditor documentation about state of commands
	 * http://docs.ckeditor.com/#!/api/CKEDITOR.command
	 */
	public static final String STATE_OFF = "CKEDITOR.TRISTATE_OFF";			//$NON-NLS-1$
	public static final String STATE_ON  = "CKEDITOR.TRISTATE_ON";			//$NON-NLS-1$
	public static final String STATE_DISABLE  = "CKEDITOR.TRISTATE_DISABLE";	//$NON-NLS-1$
	
    
    //URL CONSTANTS
    public static final URL EDIT_ICON = 	MDERichTextConstants.class.getResource("../../../../../../../icons/edit.gif"); 		//$NON-NLS-1$
    public static final URL CLEAR_ICON = MDERichTextConstants.class.getResource("../../../../../../../icons/clear.gif"); 		//$NON-NLS-1$
    public static final URL ADD_LINK_ICON = MDERichTextConstants.class.getResource("../../../../../../../icons/add_link.gif"); 	//$NON-NLS-1$
    public static final URL ADD_IMAGE_ICON = MDERichTextConstants.class.getResource("../../../../../../../icons/add_image.gif"); 	//$NON-NLS-1$

    
	private static String getDefaultCustomConfig() {
		URL resource = MDERichTextConstants.class.getResource("../../../../../../../../resources/config.js"); //$NON-NLS-1$
		try {
			return FileLocator.toFileURL(resource).toString();
		} catch (IOException e) {
			//Do nothing
		}
		return null;
	}
}