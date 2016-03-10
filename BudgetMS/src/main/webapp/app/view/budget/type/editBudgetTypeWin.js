Ext.define('BudgetMS.view.budget.type.editContPaymentWin', {
	extend : 'BudgetMS.view.budget.type.baseContPaymentWin',
	alias : 'widget.budgetTypeEdit',
	title : '预算类型修改',
	autoShow : true,
	initComponent : function() {
		this.buttons = [ {
			xtype : 'doUpdBtn',
			text : '更新',
			name : 'updateContPayment',
			action : 'budget/updateContPayment.do'
		}, {
			text : '取消',
			scope : this,
			handler : this.close
		} ]

		this.callParent(arguments);
		this.down('form').getForm().findField('budgetTypeId').readOnly = true;
	}
});