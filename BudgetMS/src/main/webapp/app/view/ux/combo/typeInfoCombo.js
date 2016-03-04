Ext.define('BudgetMS.view.ux.combo.typeInfoCombo', {
	extend : 'Ext.form.field.ComboBox',
	alias : 'widget.typeInfoCombo',
	fieldLabel : '请示类型',
	valueField : 'typeId',
	displayField : 'typeName',
	store : 'typeInfoStore'
})