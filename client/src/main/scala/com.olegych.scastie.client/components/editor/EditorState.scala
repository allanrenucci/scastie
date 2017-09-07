package com.olegych.scastie.client.components.editor

import com.olegych.scastie.api

import codemirror.{TextAreaEditor}

private[editor] case class EditorState(
    editor: Option[TextAreaEditor] = None,
    problemAnnotations: Map[api.Problem, Annotation] = Map(),
    renderAnnotations: Map[api.Instrumentation, Annotation] = Map(),
    runtimeErrorAnnotations: Map[api.RuntimeError, Annotation] = Map(),
    codeFoldsAnnotations: Map[RangePosititon, Annotation] = Map(),
    completionState: CompletionState = Idle,
    hoverMessage: HoverMessage = new HoverMessage(),
    loadingMessage: LoadingMessage = new LoadingMessage(),
    showTypeButtonPressed: Boolean = false,
    typeAt: Option[api.TypeInfoAt] = None,
    unfoldedCode: Set[RangePosititon] = Set()
)
