package cz.cvut.fit.umati.ui;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.ListSelect;

public class ParameterQuestion extends CustomComponent {
	@AutoGenerated
	private GridLayout mainLayout;

	@AutoGenerated
	private ListSelect parameterAnnotation;

	@AutoGenerated
	private Label parameterAnnotationLabel;

	@AutoGenerated
	private ComboBox parameterType;

	@AutoGenerated
	private Label parameterTypeLabel;

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	private static final long serialVersionUID = 1L;

	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	public ParameterQuestion() {
		buildMainLayout();
		setCompositionRoot(mainLayout);

		// TODO add user code here
	}

	@AutoGenerated
	private GridLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new GridLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("100%");
		mainLayout.setHeight("-1px");
		mainLayout.setMargin(false);
		mainLayout.setColumns(2);
		mainLayout.setRows(2);
		
		// top-level component properties
		setWidth("100.0%");
		setHeight("-1px");
		
		// parameterTypeLabel
		parameterTypeLabel = new Label();
		parameterTypeLabel.setImmediate(false);
		parameterTypeLabel.setWidth("-1px");
		parameterTypeLabel.setHeight("-1px");
		parameterTypeLabel.setValue("Parameter Type");
		mainLayout.addComponent(parameterTypeLabel, 0, 0);
		mainLayout.setComponentAlignment(parameterTypeLabel, new Alignment(6));
		
		// parameterType
		parameterType = new ComboBox();
		parameterType.setImmediate(false);
		parameterType.setWidth("-1px");
		parameterType.setHeight("-1px");
		mainLayout.addComponent(parameterType, 1, 0);
		
		// parameterAnnotationLabel
		parameterAnnotationLabel = new Label();
		parameterAnnotationLabel.setImmediate(false);
		parameterAnnotationLabel.setWidth("-1px");
		parameterAnnotationLabel.setHeight("-1px");
		parameterAnnotationLabel.setValue("Semantic Annotation");
		mainLayout.addComponent(parameterAnnotationLabel, 0, 1);
		mainLayout.setComponentAlignment(parameterAnnotationLabel,
				new Alignment(6));
		
		// parameterAnnotation
		parameterAnnotation = new ListSelect();
		parameterAnnotation.setImmediate(false);
		parameterAnnotation.setWidth("-1px");
		parameterAnnotation.setHeight("-1px");
		mainLayout.addComponent(parameterAnnotation, 1, 1);
		
		return mainLayout;
	}

}
