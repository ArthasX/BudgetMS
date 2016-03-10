Ext.define('BudgetMS.view.budget.info.addBudgetInfoWin', {
	extend : 'BudgetMS.view.budget.info.baseBudgetInfoWin',
	alias : 'widget.budgetInfoAdd',
	title : '合同分期付款新增',
	autoShow : true,
	initComponent : function() {
		this.buttons = [ {
			xtype : 'doAddBtn',
			text : '增加',
			name : 'insertBudgetInfo',
			action : 'budget/insertBudgetInfo.do'
		}, {
			text : '取消',
			scope : this,
			handler : this.close
		} ];
		this.callParent(arguments);
		this.down('form').getForm().findField('budgetInfoId').disabled = true;
	}
});
