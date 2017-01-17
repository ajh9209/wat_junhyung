<%@ page language="java" contentType="text/html; charset=utf-8"  pageEncoding="utf-8"%>
       
<!-- 에디터 컨테이너 시작 -->
        <div class="tx-editor-container" id="tx_trex_container">
            <!-- 사이드바 -->
            <div class="tx-sidebar" id="tx_sidebar">
                <div class="tx-sidebar-boundary">
                    <!-- 사이드바 / 첨부 -->
                    <ul class="tx-bar tx-bar-left tx-nav-attach">
                        <!-- 이미지 첨부 버튼 시작 -->
                        <!--
                            @decsription
                            <li></li> 단위로 위치를 이동할 수 있다.
                        -->
                        <li class="tx-list">
                            <div class="tx-image tx-btn-trans" id="tx_image" unselectable="on">
                                <a title="사진" class="tx-text" href="javascript:;">사진</a>
                            </div>
                        </li>
                        <!-- 이미지 첨부 버튼 끝 -->
                        <li class="tx-list">
                            <div class="tx-file tx-btn-trans" id="tx_file" unselectable="on">
                                <a title="파일" class="tx-text" href="javascript:;">파일</a>
                            </div>
                        </li>
                        <li class="tx-list">
                            <div class="tx-media tx-btn-trans" id="tx_media" unselectable="on">
                                <a title="외부컨텐츠" class="tx-text" href="javascript:;">외부컨텐츠</a>
                            </div>
                        </li>
                        <li class="tx-list tx-list-extra">
                            <div class="tx-btn-nlrbg tx-extra" unselectable="on">
                                <a title="버튼 더보기" class="tx-icon" href="javascript:;">버튼 더보기</a>
                            </div>
                            <ul class="tx-extra-menu tx-menu" style="left: -48px;" unselectable="on">
                                <!--
                                    @decsription
                                    일부 버튼들을 빼서 레이어로 숨기는 기능을 원할 경우 이 곳으로 이동시킬 수 있다.
                                -->
                            </ul>
                        </li>
                    </ul>
                    <!-- 사이드바 / 우측영역 -->
                    <ul class="tx-bar tx-bar-right">
                        <li class="tx-list">
                            <div class="tx-btn-lrbg tx-fullscreen" id="tx_fullscreen" unselectable="on">
                                <a title="넓게쓰기 (Ctrl+M)" class="tx-icon" href="javascript:;">넓게쓰기</a>
                            </div>
                        </li>
                    </ul>
                    <ul class="tx-bar tx-bar-right tx-nav-opt">
                        <li class="tx-list">
                            <div class="tx-switchtoggle" id="tx_switchertoggle" unselectable="on">
                                <a title="에디터 타입" href="javascript:;">에디터</a>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
      
            <!-- 툴바 - 기본 시작 -->
            <!--
                @decsription
                툴바 버튼의 그룹핑의 변경이 필요할 때는 위치(왼쪽, 가운데, 오른쪽) 에 따라 <li> 아래의 <div>의 클래스명을 변경하면 된다.
                tx-btn-lbg: 왼쪽, tx-btn-bg: 가운데, tx-btn-rbg: 오른쪽, tx-btn-lrbg: 독립적인 그룹
      
                드롭다운 버튼의 크기를 변경하고자 할 경우에는 넓이에 따라 <li> 아래의 <div>의 클래스명을 변경하면 된다.
                tx-slt-70bg, tx-slt-59bg, tx-slt-42bg, tx-btn-43lrbg, tx-btn-52lrbg, tx-btn-57lrbg, tx-btn-71lrbg
                tx-btn-48lbg, tx-btn-48rbg, tx-btn-30lrbg, tx-btn-46lrbg, tx-btn-67lrbg, tx-btn-49lbg, tx-btn-58bg, tx-btn-46bg, tx-btn-49rbg
            -->
            <div class="tx-toolbar tx-toolbar-basic" id="tx_toolbar_basic"><div class="tx-toolbar-boundary">
                <ul class="tx-bar tx-bar-left">
                    <li class="tx-list">
                        <div class="tx-slt-70bg tx-fontfamily" id="tx_fontfamily" unselectable="on">
                            <a title="글꼴" href="javascript:;">굴림</a>
                        </div>
                        <div class="tx-fontfamily-menu tx-menu" id="tx_fontfamily_menu" unselectable="on"></div>
                    </li>
                </ul>
                <ul class="tx-bar tx-bar-left">
                    <li class="tx-list">
                        <div class="tx-slt-42bg tx-fontsize" id="tx_fontsize" unselectable="on">
                            <a title="글자크기" href="javascript:;">9pt</a>
                        </div>
                        <div class="tx-fontsize-menu tx-menu" id="tx_fontsize_menu" unselectable="on"></div>
                    </li>
                </ul>
                <ul class="tx-bar tx-bar-left tx-group-font">
      
                    <li class="tx-list">
                        <div class="         tx-btn-lbg     tx-bold" id="tx_bold" unselectable="on">
                            <a title="굵게 (Ctrl+B)" class="tx-icon" href="javascript:;">굵게</a>
                        </div>
                    </li>
                    <li class="tx-list">
                        <div class="         tx-btn-bg  tx-underline" id="tx_underline" unselectable="on">
                            <a title="밑줄 (Ctrl+U)" class="tx-icon" href="javascript:;">밑줄</a>
                        </div>
                    </li>
                    <li class="tx-list">
                        <div class="         tx-btn-bg  tx-italic" id="tx_italic" unselectable="on">
                            <a title="기울임 (Ctrl+I)" class="tx-icon" href="javascript:;">기울임</a>
                        </div>
                    </li>
                    <li class="tx-list">
                        <div class="         tx-btn-bg  tx-strike" id="tx_strike" unselectable="on">
                            <a title="취소선 (Ctrl+D)" class="tx-icon" href="javascript:;">취소선</a>
                        </div>
                    </li>
                    <li class="tx-list">
                        <div class="         tx-slt-tbg     tx-forecolor" id="tx_forecolor" unselectable="on">
                            <a title="글자색" class="tx-icon" href="javascript:;">글자색</a>
                            <a title="글자색 선택" class="tx-arrow" href="javascript:;">글자색 선택</a>
                        </div>
                        <div class="tx-menu tx-forecolor-menu tx-colorpallete" id="tx_forecolor_menu" unselectable="on"></div>
                    </li>
                    <li class="tx-list">
                        <div class="         tx-slt-brbg    tx-backcolor" id="tx_backcolor" unselectable="on">
                            <a title="글자 배경색" class="tx-icon" href="javascript:;">글자 배경색</a>
                            <a title="글자 배경색 선택" class="tx-arrow" href="javascript:;">글자 배경색 선택</a>
                        </div>
                        <div class="tx-menu tx-backcolor-menu tx-colorpallete" id="tx_backcolor_menu" unselectable="on"></div>
                    </li>
                </ul>
                <ul class="tx-bar tx-bar-left tx-group-align">
                    <li class="tx-list">
                        <div class="         tx-btn-lbg     tx-alignleft" id="tx_alignleft" unselectable="on">
                            <a title="왼쪽정렬 (Ctrl+,)" class="tx-icon" href="javascript:;">왼쪽정렬</a>
                        </div>
                    </li>
                    <li class="tx-list">
                        <div class="         tx-btn-bg  tx-aligncenter" id="tx_aligncenter" unselectable="on">
                            <a title="가운데정렬 (Ctrl+.)" class="tx-icon" href="javascript:;">가운데정렬</a>
                        </div>
                    </li>
                    <li class="tx-list">
                        <div class="         tx-btn-bg  tx-alignright" id="tx_alignright" unselectable="on">
                            <a title="오른쪽정렬 (Ctrl+/)" class="tx-icon" href="javascript:;">오른쪽정렬</a>
                        </div>
                    </li>
                    <li class="tx-list">
                        <div class="         tx-btn-rbg     tx-alignfull" id="tx_alignfull" unselectable="on">
                            <a title="양쪽정렬" class="tx-icon" href="javascript:;">양쪽정렬</a>
                        </div>
                    </li>
                </ul>
                <ul class="tx-bar tx-bar-left tx-group-tab">
                    <li class="tx-list">
                        <div class="         tx-btn-lbg     tx-indent" id="tx_indent" unselectable="on">
                            <a title="들여쓰기 (Tab)" class="tx-icon" href="javascript:;">들여쓰기</a>
                        </div>
                    </li>
                    <li class="tx-list">
                        <div class="         tx-btn-rbg     tx-outdent" id="tx_outdent" unselectable="on">
                            <a title="내어쓰기 (Shift+Tab)" class="tx-icon" href="javascript:;">내어쓰기</a>
                        </div>
                    </li>
                </ul>
                <ul class="tx-bar tx-bar-left tx-group-list">
                    <li class="tx-list">
                        <div class="tx-slt-31lbg tx-lineheight" id="tx_lineheight" unselectable="on">
                            <a title="줄간격" class="tx-icon" href="javascript:;">줄간격</a>
                            <a title="줄간격" class="tx-arrow" href="javascript:;">줄간격 선택</a>
                        </div>
                        <div class="tx-lineheight-menu tx-menu" id="tx_lineheight_menu" unselectable="on"></div>
                    </li>
                    <li class="tx-list">
                        <div class="tx-slt-31rbg tx-styledlist" id="tx_styledlist" unselectable="on">
                            <a title="리스트" class="tx-icon" href="javascript:;">리스트</a>
                            <a title="리스트" class="tx-arrow" href="javascript:;">리스트 선택</a>
                        </div>
                        <div class="tx-styledlist-menu tx-menu" id="tx_styledlist_menu" unselectable="on"></div>
                    </li>
                </ul>
                <ul class="tx-bar tx-bar-left tx-group-etc">
                    <li class="tx-list">
                        <div class="         tx-btn-lbg     tx-emoticon" id="tx_emoticon" unselectable="on">
                            <a title="이모티콘" class="tx-icon" href="javascript:;">이모티콘</a>
                        </div>
                        <div class="tx-emoticon-menu tx-menu" id="tx_emoticon_menu" unselectable="on"></div>
                    </li>
                    <li class="tx-list">
                        <div class="         tx-btn-bg  tx-link" id="tx_link" unselectable="on">
                            <a title="링크 (Ctrl+K)" class="tx-icon" href="javascript:;">링크</a>
                        </div>
                        <div class="tx-link-menu tx-menu" id="tx_link_menu"></div>
                    </li>
                    <li class="tx-list">
                        <div class="         tx-btn-bg  tx-specialchar" id="tx_specialchar" unselectable="on">
                            <a title="특수문자" class="tx-icon" href="javascript:;">특수문자</a>
                        </div>
                        <div class="tx-specialchar-menu tx-menu" id="tx_specialchar_menu"></div>
                    </li>
                    <li class="tx-list">
                        <div class="         tx-btn-bg  tx-table" id="tx_table" unselectable="on">
                            <a title="표만들기" class="tx-icon" href="javascript:;">표만들기</a>
                        </div>
                        <div class="tx-table-menu tx-menu" id="tx_table_menu" unselectable="on">
                            <div class="tx-menu-inner">
                                <div class="tx-menu-preview"></div>
                                <div class="tx-menu-rowcol"></div>
                                <div class="tx-menu-deco"></div>
                                <div class="tx-menu-enter"></div>
                            </div>
                        </div>
                    </li>
                    <li class="tx-list">
                        <div class="         tx-btn-rbg     tx-horizontalrule" id="tx_horizontalrule" unselectable="on">
                            <a title="구분선" class="tx-icon" href="javascript:;">구분선</a>
                        </div>
                        <div class="tx-horizontalrule-menu tx-menu" id="tx_horizontalrule_menu" unselectable="on"></div>
                    </li>
                </ul>
                <ul class="tx-bar tx-bar-left">
                    <li class="tx-list">
                        <div class="         tx-btn-lbg     tx-richtextbox" id="tx_richtextbox" unselectable="on">
                            <a title="글상자" class="tx-icon" href="javascript:;">글상자</a>
                        </div>
                        <div class="tx-richtextbox-menu tx-menu" id="tx_richtextbox_menu">
                            <div class="tx-menu-header">
                                <div class="tx-menu-preview-area">
                                    <div class="tx-menu-preview"></div>
                                </div>
                                <div class="tx-menu-switch">
                                    <div class="tx-menu-simple tx-selected"><a><span>간단 선택</span></a></div>
                                    <div class="tx-menu-advanced"><a><span>직접 선택</span></a></div>
                                </div>
                            </div>
                            <div class="tx-menu-inner">
                            </div>
                            <div class="tx-menu-footer">
                                <img class="tx-menu-confirm" alt="" src="${pageContext.request.contextPath}/daumOpenEditor/images/icon/editor/btn_confirm.gif?rv=1.0.1">
                                <img class="tx-menu-cancel" alt="" src="${pageContext.request.contextPath}/daumOpenEditor/images/icon/editor/btn_cancel.gif?rv=1.0.1" hspace="3">
                            </div>
                        </div>
                    </li>
                    <li class="tx-list">
                        <div class="         tx-btn-bg  tx-quote" id="tx_quote" unselectable="on">
                            <a title="인용구 (Ctrl+Q)" class="tx-icon" href="javascript:;">인용구</a>
                        </div>
                        <div class="tx-quote-menu tx-menu" id="tx_quote_menu" unselectable="on"></div>
                    </li>
                    <li class="tx-list">
                        <div class="         tx-btn-bg  tx-background" id="tx_background" unselectable="on">
                            <a title="배경색" class="tx-icon" href="javascript:;">배경색</a>
                        </div>
                        <div class="tx-menu tx-background-menu tx-colorpallete" id="tx_background_menu" unselectable="on"></div>
                    </li>
                    <li class="tx-list">
                        <div class="         tx-btn-rbg     tx-dictionary" id="tx_dictionary" unselectable="on">
                            <a title="사전" class="tx-icon" href="javascript:;">사전</a>
                        </div>
                    </li>
                </ul>
                <ul class="tx-bar tx-bar-left tx-group-undo">
                    <li class="tx-list">
                        <div class="         tx-btn-lbg     tx-undo" id="tx_undo" unselectable="on">
                            <a title="실행취소 (Ctrl+Z)" class="tx-icon" href="javascript:;">실행취소</a>
                        </div>
                    </li>
                    <li class="tx-list">
                        <div class="         tx-btn-rbg     tx-redo" id="tx_redo" unselectable="on">
                            <a title="다시실행 (Ctrl+Y)" class="tx-icon" href="javascript:;">다시실행</a>
                        </div>
                    </li>
                </ul>
                <ul class="tx-bar tx-bar-right">
                    <li class="tx-list">
                        <div class="tx-btn-nlrbg tx-advanced" id="tx_advanced" unselectable="on">
                            <a title="툴바 더보기" class="tx-icon" href="javascript:;">툴바 더보기</a>
                        </div>
                    </li>
                </ul>
            </div></div>
            <!-- 툴바 - 기본 끝 -->
            <!-- 툴바 - 더보기 시작 -->
            <div class="tx-toolbar tx-toolbar-advanced" id="tx_toolbar_advanced"><div class="tx-toolbar-boundary">
                <ul class="tx-bar tx-bar-left">
                    <li class="tx-list">
                        <div class="tx-tableedit-title"></div>
                    </li>
                </ul>
      
                <ul class="tx-bar tx-bar-left tx-group-align">
                    <li class="tx-list">
                        <div class="tx-btn-lbg tx-mergecells" id="tx_mergecells" unselectable="on">
                            <a title="병합" class="tx-icon2" href="javascript:;">병합</a>
                        </div>
                        <div class="tx-mergecells-menu tx-menu" id="tx_mergecells_menu" unselectable="on"></div>
                    </li>
                    <li class="tx-list">
                        <div class="tx-btn-bg tx-insertcells" id="tx_insertcells" unselectable="on">
                            <a title="삽입" class="tx-icon2" href="javascript:;">삽입</a>
                        </div>
                        <div class="tx-insertcells-menu tx-menu" id="tx_insertcells_menu" unselectable="on"></div>
                    </li>
                    <li class="tx-list">
                        <div class="tx-btn-rbg tx-deletecells" id="tx_deletecells" unselectable="on">
                            <a title="삭제" class="tx-icon2" href="javascript:;">삭제</a>
                        </div>
                        <div class="tx-deletecells-menu tx-menu" id="tx_deletecells_menu" unselectable="on"></div>
                    </li>
                </ul>
      
                <ul class="tx-bar tx-bar-left tx-group-align">
                    <li class="tx-list">
                        <div class="tx-slt-70lbg tx-cellslinepreview" id="tx_cellslinepreview" unselectable="on">
                            <a title="선 미리보기" href="javascript:;"></a>
                        </div>
                        <div class="tx-cellslinepreview-menu tx-menu" id="tx_cellslinepreview_menu" unselectable="on"></div>
                    </li>
                    <li class="tx-list">
                        <div class="tx-slt-tbg tx-cellslinecolor" id="tx_cellslinecolor" unselectable="on">
                            <a title="선색" class="tx-icon2" href="javascript:;">선색</a>
      
                            <div class="tx-colorpallete" unselectable="on"></div>
                        </div>
                        <div class="tx-cellslinecolor-menu tx-menu tx-colorpallete" id="tx_cellslinecolor_menu" unselectable="on"></div>
                    </li>
                    <li class="tx-list">
                        <div class="tx-btn-bg tx-cellslineheight" id="tx_cellslineheight" unselectable="on">
                            <a title="두께" class="tx-icon2" href="javascript:;">두께</a>
      
                        </div>
                        <div class="tx-cellslineheight-menu tx-menu" id="tx_cellslineheight_menu" unselectable="on"></div>
                    </li>
                    <li class="tx-list">
                        <div class="tx-btn-bg tx-cellslinestyle" id="tx_cellslinestyle" unselectable="on">
                            <a title="스타일" class="tx-icon2" href="javascript:;">스타일</a>
                        </div>
                        <div class="tx-cellslinestyle-menu tx-menu" id="tx_cellslinestyle_menu" unselectable="on"></div>
                    </li>
                    <li class="tx-list">
                        <div class="tx-btn-rbg tx-cellsoutline" id="tx_cellsoutline" unselectable="on">
                            <a title="테두리" class="tx-icon2" href="javascript:;">테두리</a>
      
                        </div>
                        <div class="tx-cellsoutline-menu tx-menu" id="tx_cellsoutline_menu" unselectable="on"></div>
                    </li>
                </ul>
                <ul class="tx-bar tx-bar-left">
                    <li class="tx-list">
                        <div class="tx-btn-lrbg tx-tablebackcolor" id="tx_tablebackcolor" style="background-color: rgb(154, 165, 234);" unselectable="on">
                            <a title="테이블 배경색" class="tx-icon2" href="javascript:;">테이블 배경색</a>
                        </div>
                        <div class="tx-tablebackcolor-menu tx-menu tx-colorpallete" id="tx_tablebackcolor_menu" unselectable="on"></div>
                    </li>
                </ul>
                <ul class="tx-bar tx-bar-left">
                    <li class="tx-list">
                        <div class="tx-btn-lrbg tx-tabletemplate" id="tx_tabletemplate" unselectable="on">
                            <a title="테이블 서식" class="tx-icon2" href="javascript:;">테이블 서식</a>
                        </div>
                        <div class="tx-tabletemplate-menu tx-menu tx-colorpallete" id="tx_tabletemplate_menu" unselectable="on"></div>
                    </li>
                </ul>
      
            </div></div>
            <!-- 툴바 - 더보기 끝 -->
            <!-- 편집영역 시작 -->
                <!-- 에디터 Start -->
    <div class="tx-canvas" id="tx_canvas">
        <div class="tx-loading" id="tx_loading"><div><img width="113" height="21" align="absmiddle" src="${pageContext.request.contextPath}/daumOpenEditor/images/icon/editor/loading2.png"></div></div>
        <div class="tx-holder" id="tx_canvas_wysiwyg_holder" style="display: block;">
            <iframe name="tx_canvas_wysiwyg" id="tx_canvas_wysiwyg" frameborder="0" allowtransparency="true"></iframe>
        </div>
        <div class="tx-source-deco">
            <div class="tx-holder" id="tx_canvas_source_holder">
                <textarea id="tx_canvas_source" rows="30" cols="30"></textarea>
            </div>
        </div>
        <div class="tx-holder" id="tx_canvas_text_holder">
            <textarea id="tx_canvas_text" rows="30" cols="30"></textarea>
        </div>
    </div>
                    <!-- 높이조절 Start -->
    <div class="tx-resize-bar" id="tx_resizer">
        <div class="tx-resize-bar-bg"></div>
        <img width="58" height="12" id="tx_resize_holder" alt="" src="${pageContext.request.contextPath}/daumOpenEditor/images/icon/editor/skin/01/btn_drag01.gif" unselectable="on">
    </div>
                    <div class="tx-side-bi" id="tx_side_bi">
        <div style="text-align: right;">
            <img width="78" height="14" align="absmiddle" src="${pageContext.request.contextPath}/daumOpenEditor/images/icon/editor/editor_bi.png" hspace="4">
        </div>
    </div>
                <!-- 편집영역 끝 -->
            <!-- 첨부박스 시작 -->
                <!-- 파일첨부박스 Start -->
    <div class="tx-attach-div" id="tx_attach_div">
        <div class="tx-attach-txt" id="tx_attach_txt">파일 첨부</div>
        <div class="tx-attach-box" id="tx_attach_box">
            <div class="tx-attach-box-inner">
                <div class="tx-attach-preview" id="tx_attach_preview"><p> </p><img width="147" height="108" src="${pageContext.request.contextPath}/daumOpenEditor/images/icon/editor/pn_preview.gif" unselectable="on"></div>
                <div class="tx-attach-main">
                    <div class="tx-upload-progress" id="tx_upload_progress"><div>0%</div><p>파일을 업로드하는 중입니다.</p></div>
                    <ul class="tx-attach-top">
                        <li class="tx-attach-delete" id="tx_attach_delete"><a>전체삭제</a></li>
                        <li class="tx-attach-size" id="tx_attach_size">
                            파일: <span class="tx-attach-size-up" id="tx_attach_up_size"></span>/<span id="tx_attach_max_size"></span>
                        </li>
                        <li class="tx-attach-tools" id="tx_attach_tools">
                        </li>
                    </ul>
                    <ul class="tx-attach-list" id="tx_attach_list"></ul>
                </div>
            </div>
        </div>
    </div>
                <!-- 첨부박스 끝 -->
        </div>
        <!-- 에디터 컨테이너 끝 -->