Ext.define('BudgetMS.view.ux.combo.deptCombo', {
	extend : 'Ext.form.field.ComboBox',
	alias : 'widget.deptCombo',
	fieldLabel : '请示类型',
	valueField : 'deptId',
	displayField : 'deptName',
	store : 'deptStore'
})